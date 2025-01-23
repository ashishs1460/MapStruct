package org.example.multipleMapping;

import org.example.basicMapping.Student;
import org.example.basicMapping.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DeliveryAddressMapper {
    @Mapping(source = "student.name",target = "name")
    @Mapping(source = "address.houseNo",target = "houseNumber")
    DeliveryAddress getDeliveryAddress(StudentEntity student, AddressEntity address);
}
