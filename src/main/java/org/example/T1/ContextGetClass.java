package org.example.T1;

import org.example.ValidateProp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ContextGetClass {
    public static void test(Object obj){
        System.out.println("test of call method ...");
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        List<Method> methodList = Arrays.asList(methods);
        methodList.forEach(m->{
            m.setAccessible(true);
            TestMethod annotation = m.getAnnotation(TestMethod.class);
            if(annotation != null){
                try{
                    m.invoke(obj);
                }catch (Exception e){
                    System.out.println("this exception happen when run method " + e.getClass()+ " this message : " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }
}
