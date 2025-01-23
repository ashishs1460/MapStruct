package org.example.directFieldMapping;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target="className", source="classVal")
    @Mapping(target="subject", source="subject.name")
    Student getModelFromEntity(StudentEntity studentEntity);

    @InheritInverseConfiguration
    StudentEntity getEntityFromModel(Student student);

    //Automatically reverses mapping configuration
    //Reduces duplicate mapping annotations
    //Ensures consistency between forward and reverse mappings

}

/*
* MapStruct handles direct fields mapping easily.
*  For example, a Student with section as private property and StudentEntity with section as public property.
*  To have both getter/setter mapping, a property should be public.
* In case of public final, only getter method will be present for mapping.
*
* */
