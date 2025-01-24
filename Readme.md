MapStruct Overview

Introduction

MapStruct is a Java-based library that simplifies the process of mapping data objects to model objects using annotations. It automates type conversions and allows developers to add custom mapping logic when needed.

Key Features

Automates type conversions (e.g., int to Long, or String conversions).

Supports custom mapping methods using annotations.

Handles complex type conversions like numbers to strings or dates to specific formats.

Installation Requirements

MapStruct requires the Java Development Kit (JDK) to be installed on your machine.

Features and Syntax

Automatic Type Conversion

MapStruct handles common type conversions automatically. For instance:

Source: int

Target: Long or String

Number Formatting

MapStruct can convert numbers to strings in the desired format seamlessly. Use the numberFormat attribute in the @Mapping annotation.

Example

Source: Entity has price as 350.

Target: Model displays price as $350.00.

Format: $#.00

@Mapping(target = "price", source = "price", numberFormat = "$#.00")

Date Formatting

MapStruct can convert dates to strings in a specific format using the dateFormat attribute in the @Mapping annotation.

Example

Source: Entity has date as GregorianCalendar(2015, 3, 5).

Target: Model displays date as 05.04.2015.

Format: dd.MM.yyyy

@Mapping(target = "manufacturingDate", source = "manufacturingDate", dateFormat = "dd.MM.yyyy")

Custom Conversion Methods

MapStruct supports calling custom methods for conversion using the expression attribute.

Syntax

@Mapping(target = "targetProperty", expression = "java(targetMethod())")

Example

To call a method from another class:

@Mapping(target = "propertyName", expression = "java(UtilityClass.methodName())")

Constant Value Mapping

MapStruct allows mapping a constant value to a property.

Syntax

@Mapping(target = "targetProperty", constant = "constantValue")

Default Value Handling

MapStruct can set default values if the source property is null using the defaultValue attribute.

Syntax

@Mapping(target = "targetProperty", source = "sourceProperty", defaultValue = "defaultValue")

Computed Default Values

MapStruct can compute default values if the source property is null using the defaultExpression attribute.

Syntax

@Mapping(target = "targetProperty", source = "sourceProperty", defaultExpression = "java(computeDefaultValue())")

Mapping Lists

MapStruct supports mapping lists by providing a mapper method to handle the individual object mappings.

Example

@Mapper
public interface CarMapper {
    List<String> getListOfStrings(List<Integer> listOfIntegers);
    List<Car> getCars(List<CarEntity> carEntities);
    Car getModelFromEntity(CarEntity carEntity);
}

Mapping Maps

MapStruct can map Map objects using the @MapMapping annotation.

Syntax

@Mapper
public interface UtilityMapper {
    @MapMapping(valueDateFormat = "dd.MM.yyyy")
    Map<String, String> getMap(Map<Long, GregorianCalendar> source);
}

Mapping Streams

MapStruct supports mapping Java Streams similarly to collections.

Syntax

@Mapper
public interface UtilityMapper {
    Stream<String> getStream(Stream<Integer> source);
}

Enum Mapping

MapStruct automatically maps enums with identical names. For enums with different names, use the @ValueMapping annotation.

Example

@Mapper
public interface UtilityMapper {
    @ValueMapping(source = "EXTRA", target = "SPECIAL")
    PlacedOrderType getEnum(OrderType order);
}

Exception Handling in Custom Mapping

MapStruct allows throwing specific exceptions during custom mappings.

Example

@Mapper(uses = DateMapper.class)
public interface UtilityMapper {
    CarEntity getCarEntity(Car car) throws ParseException;
}

Conclusion

MapStruct is a powerful library for simplifying object mapping in Java projects. By leveraging annotations, developers can focus on business logic while MapStruct takes care of the data transformation seamlessly. With support for custom methods, type conversions, and exception handling, MapStruct proves to be a versatile tool in any Java developer's toolkit.

