import org.example.basicMapping.Student;
import org.example.basicMapping.StudentEntity;
import org.example.basicMapping.StudentMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentMapperTest {
    private StudentMapper  studentMapper = Mappers.getMapper(StudentMapper.class);
    //Mappers.getMapper is a utility method provided by MapStruct to obtain an instance of the specified mapper interface.
    @Test
    public void testEntityToModel(){
        StudentEntity entity = new StudentEntity();
        entity.setId(1);
        entity.setName("Aravind");
        entity.setClassVal("Civil Engineering");
        Student model = studentMapper.getModelFromEntity(entity);

        assertEquals(entity.getId(), model.getId(), "IDs should match");
        assertEquals(entity.getName(), model.getName(), "Names should match");
        assertEquals(entity.getClassVal(), model.getClassName(), "Class values should match");

    }
    public void  testModelToEntity(){
        Student model = new Student();
        model.setId(1);
        model.setName("Ashish");
        model.setClassName("Mechanical Engineering");
        StudentEntity entity = studentMapper.getEntityFromModel(model);

        assertEquals(entity.getClassVal(), model.getClassName());
        assertEquals(entity.getName(), model.getName());
        assertEquals(entity.getId(), model.getId());
    }


}
