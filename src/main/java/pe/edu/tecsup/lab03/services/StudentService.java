package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();

    public List<StudentEntity> listar() {
        return studentRepository.findAll();
    }

    public Optional<StudentEntity> buscarPorId(Long id) {
        return studentRepository.findById(id);
    }

    public StudentEntity guardar(StudentEntity student) {
        return studentRepository.save(student);
    }

    public void eliminar(Long id) {
        studentRepository.deleteById(id);
    }
}