package org.example.mappingCollections.mappingMaps;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;

import java.util.GregorianCalendar;
import java.util.Map;

@Mapper
public interface UtilityMapper {
    @MapMapping(valueDateFormat = "dd.MM.yyy")
    Map<String,String> getMap(Map<Long, GregorianCalendar> source);
}
