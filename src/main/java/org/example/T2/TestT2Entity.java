package org.example.T2;



@Table
public class TestT2Entity {
    @Field
    private int id;
    @Field
    private String name ;

    public TestT2Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
