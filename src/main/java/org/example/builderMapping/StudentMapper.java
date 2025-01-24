package org.example.builderMapping;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    Student getModelFromEntity(StudentEntity studentEntity);
    @Mapping(target = "name",source = "name")
    @Mapping(target = "id",source = "id")
    StudentEntity getEntityFromModel(Student student);
}
