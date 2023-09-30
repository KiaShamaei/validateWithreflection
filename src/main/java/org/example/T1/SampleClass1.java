package org.example.T1;

public class SampleClass1 {
    @TestMethod
    public void m1() throws ClassNotFoundException {
        System.out.println("method m1 call ...");
        Class.forName("...");
    }
    @TestMethod
    public void m2() throws ClassNotFoundException {
        System.out.println("method m2 call ...");
    }
}
