import org.example.mappingCollections.mappingMaps.UtilityMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilityMapperTest {
    private UtilityMapper utilityMapper = Mappers.getMapper(UtilityMapper.class);
    @Test
    public void testMapMapping(){
        Map<Long, GregorianCalendar> source = new HashMap<>();
        source.put(1L, new GregorianCalendar(2015, 3, 5));
        Map<String,String> target = utilityMapper.getMap(source);
        assertEquals("05.04.2015", target.get("1"));

    }
}
