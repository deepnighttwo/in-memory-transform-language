package com.dnt.itl.test.invokedynamic;

/**
 * User: Mark Zang
 * Date: 2015/5/2
 * Time: 23:06
 */

import java.lang.invoke.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Invoker {

    public static class Employee {

        public String name = "Rick";

        public String getName() {
            return name + "##";
        }

        public void setName(String name) {
            this.name = name;
        }

        public String name() {
            return name;
        }

    }

    private static MethodHandle printArgs;

    private static void printArgs(Object... args) {
        System.out.println(java.util.Arrays.deepToString(args));
    }


    public static void main(String[] arg) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class thisClass = lookup.lookupClass();  // (who am I?)

        Employee data = new Employee();

        MethodHandle setField = lookup.findSetter(Employee.class, "name", String.class);
        setField.invokeExact(data, "New Bee Invokedynamic");

        MethodHandle getMethodHandler = lookup.findGetter(Employee.class, "name", String.class);
        System.out.println((String) getMethodHandler.invokeExact(data));


        MethodType mt = MethodType.methodType(String.class);
        MethodHandle getMethod = lookup.findVirtual(Employee.class, "getName", mt);
        System.out.println((String) getMethod.invokeExact(data));
        System.out.println();

        Method method = Employee.class.getMethod("getName");
        MethodHandle unrefMethod = lookup.unreflect(method);
        System.out.println(unrefMethod.invoke(data));

        printArgs = lookup.findStatic(thisClass,
                "printArgs", MethodType.methodType(void.class, Object[].class));

        CallSite callSite = new ConstantCallSite(printArgs);


        printArgs.invoke("Hi Mom!", "Hi World!");

        callSite.dynamicInvoker().invoke("Hi Mom!", "Hi World!");

        CallSite callSite2 = new ConstantCallSite(printArgs.asType(MethodType.methodType(void.class,
                int.class, int.class)));

        try {
            callSite2.dynamicInvoker().invoke("Hi Mom!", "Hi World!");
            throw new AssertionError("Should never get here");
        } catch (WrongMethodTypeException wmte) {

        }

        callSite2.dynamicInvoker().invoke(1, 2);


        MethodType methodType;
        MethodHandle methodHandle;
        String str;
        Object obj;

        //Call a virtual method on String
        // mt is (char,char)String
        methodType = MethodType.methodType(String.class, char.class, char.class);
        methodHandle = lookup.findVirtual(String.class, "replace", methodType);
        str = (String) methodHandle.invokeExact("daddy", 'd', 'n');
        System.out.println(str);

        //Call it with loose arguments
        str = (String) methodHandle.invoke((Object) "daddy", 'd', 'n');
        System.out.println(str);

        //Looser not sure the dif between this and the last call.
        // weakly typed invocation (using MHs.invoke)
        str = (String) methodHandle.invokeWithArguments("sappy", 'p', 'v');
        System.out.println(str);


        //Call a static method, in this case java.util.Arrays.
        // mt is (Object[])List
        methodType = MethodType.methodType(java.util.List.class, Object[].class);
        methodHandle = lookup.findStatic(java.util.Arrays.class, "asList", methodType);
        List list = (List) methodHandle.invoke("one", "two");
        System.out.println(list);

        //If you don't really care about types, I think this would cause more boxing.
        //// mt is (Object,Object,Object)Object
        methodType = MethodType.genericMethodType(3);
        methodHandle = methodHandle.asType(methodType);
        obj = methodHandle.invokeExact((Object) 1, (Object) 2, (Object) 3);
        System.out.println(obj.getClass().getName());
        System.out.println(obj);


        //If you want to avoid auto-boxing you can cast to an int.
        //This is a Java 7 lang feature and it boggles my mind.
        //// mt is ()int
        methodType = MethodType.methodType(int.class);
        methodHandle = lookup.findVirtual(java.util.List.class, "size", methodType);
        int size = (int) methodHandle.invokeExact(java.util.Arrays.asList(1, 2, 3));
        System.out.println(size);


        //Look up a virtual method println on System.out
        methodType = MethodType.methodType(void.class, String.class);
        methodHandle = lookup.findVirtual(java.io.PrintStream.class, "println", methodType);
        methodHandle.invokeExact(System.out, "Hello, world.");


        //Lookup the getName method on Employee object
        methodType = MethodType.methodType(String.class);
        methodHandle = lookup.findVirtual(Employee.class, "getName", methodType);
        String name = (String) methodHandle.invokeExact(new Employee());
        System.out.println(name);


        //Get the declared for name, make is accessible then look up its callsite.
        Field fieldName = null;
        for (Field field : Employee.class.getDeclaredFields()) {
            if (field.getName().equals("name")) {
                fieldName = field;
                fieldName.setAccessible(true);
                break;
            }
        }
        methodHandle = lookup.unreflectGetter(fieldName);
        name = (String) methodHandle.invokeExact(new Employee());
        System.out.println(name);

        //
    }
}