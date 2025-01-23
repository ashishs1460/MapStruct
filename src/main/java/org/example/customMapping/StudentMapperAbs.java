package org.example.customMapping;

import org.example.basicMapping.Student;
import org.example.basicMapping.StudentEntity;
import org.mapstruct.Mapper;

@Mapper
abstract public class StudentMapperAbs {
    Student getModelFromEntity(StudentEntity studentEntity){
        Student student = new Student();
        student.setId(studentEntity.getId());
        student.setName(studentEntity.getName());
        student.setClassName(studentEntity.getClassVal());
        return  student;
    }
}
