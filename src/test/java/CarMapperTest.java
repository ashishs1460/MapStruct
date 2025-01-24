import org.example.dataTypeConversion.numberFormat.Car;
import org.example.dataTypeConversion.numberFormat.CarEntity;
import org.example.dataTypeConversion.numberFormat.CarMapper;
import org.example.dataTypeConversion.numberFormat.CarMapperExpression;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {

  private CarMapper carMapper = Mappers.getMapper(CarMapper.class);
  //  private CarMapperExpression carMapper = Mappers.getMapper(CarMapperExpression.class);
    @Test
    public void testEntityToModel(){
        CarEntity carEntity = new CarEntity();
        carEntity.setId(1);
        carEntity.setPrice(45000);
        carEntity.setManufacturingDate(new GregorianCalendar(2015, 3, 5));
        Car car = carMapper.getModelFromEntity(carEntity);
        assertEquals(carEntity.getId(),car.getId());
        assertEquals(car.getPrice(),"$45000.00");
        assertEquals(car.getManufacturingDate(),"05.04.2015");
        assertEquals("Suzuki", car.getBrand());
//        assertEquals("Sample",car.getName());
        assertNotNull(car.getName());

    }
}
