package org.example.dataTypeConversion.numberFormat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.UUID;


@Mapper(imports = UUID.class)
public interface CarMapper {
//    @Mapping(source = "name",target = "name",defaultValue = "Sample")
    @Mapping(target = "name", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target= "brand",constant = "Suzuki")
    @Mapping(source = "price",target = "price", numberFormat = "$#.00")
    @Mapping(source = "manufacturingDate", target = "manufacturingDate" , dateFormat = "dd.MM.yyyy")
    Car getModelFromEntity(CarEntity carEntity);
}
