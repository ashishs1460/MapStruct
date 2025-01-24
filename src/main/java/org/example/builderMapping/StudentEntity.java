package org.example.builderMapping;

import org.example.nestedBeanMapping.SubjectEntity;

public class StudentEntity {
    private String id;
    private String name;
    private String classVal;
    private SubjectEntity subject;
    public String section;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassVal() {
        return classVal;
    }
    public void setClassVal(String classVal) {
        this.classVal = classVal;
    }
    public SubjectEntity getSubject() {
        return subject;
    }
    public void setSubject(SubjectEntity subject) {
        this.subject = subject;
    }
}
