MapStruct automates the process of creating a mapper to map data objects with model objects using annotations.
MapStruct is a Java based library, so the very first requirement is to have JDK installed on your machine.
We can add custom methods as well to the Mapper created using org.mapstruct.Mapper annotation.

*MapStruct handles conversion of type conversions automatically in most of the cases. For example, int to Long or String conversion

------------------------------
MapStruct handles conversion of numbers to String in required format seamlessly. We can pass the required format as numberFormat during @Mapping annotation. For example, consider a case where an amount stored in numbers is to be shown in currency format.

Source − Entity has price as 350.

Target − Model to show price as $350.00.

numberFormat − Use format $#.00

---------------------------------------
MapStruct handles conversion of date to String in required format seamlessly. We can pass the required format as dateFormat during @Mapping annotation. For example, consider a case where a date stored in numbers is to be shown in particular format.

Source − Entity has date as GregorianCalendar(2015, 3, 5).

Target − Model to show date as 05.04.2015.

dateFormat − Use format dd.MM.yyyy