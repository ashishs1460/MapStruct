package org.example.dataTypeConversion.numberFormat;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Mapper
public interface CarMapperExpression {
    @Mapping(source = "price", target = "price", numberFormat = "$#.00")
    @Mapping(target = "manufacturingDate",
            expression = "java(getManufacturingDate(carEntity.getManufacturingDate()))")
    Car getModelFromEntity(CarEntity carEntity);

    default String getManufacturingDate(GregorianCalendar manufacturingDate) {
        Date d = manufacturingDate.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat( "dd.MM.yyyy" );
        return sdf.format( d );
    }
}
