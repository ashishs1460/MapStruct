package org.example.nestedBeanMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target="className", source="classVal")
    @Mapping(target="subject", source="subject.name")
    Student getModelFromEntity(StudentEntity studentEntity);

    @Mapping(target="classVal", source="className")
    @Mapping(target="subject.name", source="subject")
    StudentEntity getEntityFromModel(Student student);
}
