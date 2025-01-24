import org.example.builderMapping.Student;
import org.example.builderMapping.StudentEntity;
import org.example.builderMapping.StudentMapper;


import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentBuilderMapperTest {

    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);
    @Test
    public void testEntityToModel(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId("10");
        studentEntity.setName("George");
        Student student = studentMapper.getModelFromEntity(studentEntity);
        assertEquals(Integer.parseInt(studentEntity.getId()),student.getId());
        assertEquals(studentEntity.getName(),student.getName());
    }
    @Test
    public void testModelToEntity(){
        Student student = Student.builder()
                .id(20)
                .name("David")
                .create();
        StudentEntity studentEntity = studentMapper.getEntityFromModel(student);
        assertEquals(Integer.parseInt(studentEntity.getId()),student.getId());
        assertEquals(studentEntity.getName(),student.getName());
    }
}
