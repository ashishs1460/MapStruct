package org.example.dataTypeConversion.numberFormat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {
    @Mapping(source = "price",target = "price", numberFormat = "$#.00")
    @Mapping(source = "manufacturingDate", target = "manufacturingDate" , dateFormat = "dd.MM.yyyy")
    Car getModelFromEntity(CarEntity carEntity);
}
