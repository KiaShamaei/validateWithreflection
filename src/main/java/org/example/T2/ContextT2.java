package org.example.T2;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ContextT2 {
    public  static void test( String packageName) throws ClassNotFoundException {
        System.out.println("test method call ...");
        // Prepare.
        List<Class<?>> commands = new ArrayList<>();
        System.out.println("path for search class : "+ packageName);
        String pathUrl = packageName.replace(".", "/");
        URL root = Thread.currentThread().getContextClassLoader().getResource(pathUrl);
        System.out.println("url for search is : " + root);

// Filter .class files.
        File[] files = new File(root.getFile()).listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".class");
            }
        });
        System.out.println(files);

// Find classes implementing ICommand.
        for (File file : files) {
            String className = file.getName().replaceAll(".class$", "");
            System.out.println("class name item " + className);
            Class<?> cls = Class.forName(packageName + "." + className);
                commands.add((Class<?>) cls);
        }

    }

}
