package org.example.builderMapping;

public class Student {
    private final String name;
    private final int id;

    protected Student(Student.Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
    }
    public static Student.Builder builder() {
        return new Student.Builder();
    }
    public static class Builder {
        private String name;
        private int id;
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder id(int id) {
            this.id = id;
            return this;
        }
        public Student create() {
            return new Student( this );
        }
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}