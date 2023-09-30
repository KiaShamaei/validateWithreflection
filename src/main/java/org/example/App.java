package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "test run" );
        TestEntityObject t = new TestEntityObject(20, 21);
        ContextTest.test(t);
    }
}
