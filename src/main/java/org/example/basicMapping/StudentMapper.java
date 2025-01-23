package org.example.basicMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target = "className" , source = "classVal")
    Student getModelFromEntity(StudentEntity studentEntity);
    @Mapping(target = "classVal", source = "className")
    StudentEntity getEntityFromModel(Student student);
}
