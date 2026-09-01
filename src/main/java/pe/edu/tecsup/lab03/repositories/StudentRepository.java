package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

    private final List<StudentEntity> students = new ArrayList<>();
    private Long nextId = 1L;

    public List<StudentEntity> findAll() {
        return students;
    }

    public Optional<StudentEntity> findById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    public StudentEntity save(StudentEntity student) {
        if (student.getId() == null) {
            student.setId(nextId++);
        }
        students.add(student);
        return student;
    }

    public void deleteById(Long id) {
        students.removeIf(s -> s.getId().equals(id));
    }

    public void limpiarDatos () {
        students.clear();
    }
}