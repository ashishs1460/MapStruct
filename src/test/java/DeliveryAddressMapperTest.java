import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.basicMapping.StudentEntity;
import org.example.multipleMapping.AddressEntity;
import org.example.multipleMapping.DeliveryAddress;
import org.example.multipleMapping.DeliveryAddressMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;


public class DeliveryAddressMapperTest {
    private DeliveryAddressMapper deliveryAddressMapper = Mappers.getMapper(DeliveryAddressMapper.class);

    @Test
    public void testEntityToModel() {
        StudentEntity student = new StudentEntity();
        student.setClassVal("X");
        student.setName("John");
        student.setId(1);

        AddressEntity address = new AddressEntity();
        address.setCity("Y");
        address.setState("Z");
        address.setHouseNo(1);

        DeliveryAddress deliveryAddress = deliveryAddressMapper.getDeliveryAddress(student, address);

        assertEquals(deliveryAddress.getName(), student.getName());
        assertEquals(deliveryAddress.getCity(), address.getCity());
        assertEquals(deliveryAddress.getState(), address.getState());
        assertEquals(deliveryAddress.getHouseNumber(), address.getHouseNo());
    }
}