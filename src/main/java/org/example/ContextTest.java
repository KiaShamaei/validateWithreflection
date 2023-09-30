package org.example;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ContextTest {
    public static void test(Object obj){
        System.out.println("test of validate call ...");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<Field> fieldsList = Arrays.asList(fields);
        fieldsList.forEach(t->{
            t.setAccessible(true);
            ValidateProp annotation = t.getAnnotation(ValidateProp.class);
            if(annotation != null){
                try {
                    if(annotation.min() > (int)t.get(obj)){
                        System.out.println("field validation min error ..." + t.getName());
                    }else if(annotation.max() < (int)t.get(obj)){
                        System.out.println("field validation max error ..." + t.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
