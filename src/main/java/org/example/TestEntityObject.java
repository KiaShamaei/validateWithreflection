package org.example;

public class TestEntityObject {
    @ValidateProp(min = 10 , max = 15)
    private int id ;
    @ValidateProp(min = 20 , max = 30)
    private int age ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestEntityObject(int id, int age) {
        this.id = id;
        this.age = age;
    }

}
