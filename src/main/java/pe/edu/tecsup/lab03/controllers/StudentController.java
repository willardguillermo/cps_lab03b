package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;

public class StudentController {

    private final StudentService studentService = new StudentService();

    public List<StudentEntity> listar() {
        return studentService.listar();
    }

    public StudentEntity buscarPorId(Long id) {
        return studentService.buscarPorId(id).orElse(null);
    }

    public StudentEntity guardar(StudentEntity student) {
        return studentService.guardar(student);
    }

    public void eliminar(Long id) {
        studentService.eliminar(id);
    }
}