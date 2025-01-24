import org.example.dataTypeConversion.numberFormat.Car;
import org.example.dataTypeConversion.numberFormat.CarEntity;
import org.example.dataTypeConversion.numberFormat.CarMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMapperTest {

    private CarMapper carMapper = Mappers.getMapper(CarMapper.class);
    @Test
    public void testEntityToModel(){
        CarEntity carEntity = new CarEntity();
        carEntity.setId(1);
        carEntity.setPrice(45000);
        Car car = carMapper.getModelFromEntity(carEntity);
        assertEquals(carEntity.getId(),car.getId());
        assertEquals(car.getPrice(),"$45000.00");
    }
}
