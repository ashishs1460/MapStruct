import org.example.builderMapping.Student;
import org.example.builderMapping.StudentMapper;

import org.example.directFieldMapping.StudentEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentBuilderMapperTest {

    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);
    @Test
    public void testEntityToModel(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(10);
        studentEntity.setName("George");
        Student student = studentMapper.getModelFromEntity(studentEntity);
        assertEquals(studentEntity.getId(),student.getId());
        assertEquals(studentEntity.getName(),student.getName());
    }
    @Test
    public void testModelToEntity(){
        Student student = Student.builder()
                .id(20)
                .name("David")
                .create();
        StudentEntity studentEntity = studentMapper.getEntityFromModel(student);
        assertEquals(studentEntity.getId(),student.getId());
        assertEquals(studentEntity.getName(),student.getName());
    }
}
