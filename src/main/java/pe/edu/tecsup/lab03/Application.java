package pe.edu.tecsup.lab03;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class Application {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        StudentEntity student1 = new StudentEntity(null, "Juan", "Perez", "juan.perez@mail.com", "Software");
        StudentEntity student2 = new StudentEntity(null, "Maria", "Lopez", "maria.lopez@mail.com", "Administracion");
        StudentEntity student3 = new StudentEntity(null, "Carlos", "Gomez", "carlos.gomez@mail.com", "Comunicacion");

        studentService.guardar(student1);
        studentService.guardar(student2);
        studentService.guardar(student3);

        System.out.println("=== Lista de estudiantes ===");
        studentService.listar().forEach(System.out::println);

        System.out.println("\n=== Buscar estudiante con id=1 ===");
        StudentEntity encontrado = studentService.buscarPorId(1L).orElse(null);
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("\n=== Eliminando estudiante con id=2 ===");
        studentService.eliminar(2L);

        System.out.println("\n=== Lista de estudiantes después de eliminar ===");
        studentService.listar().forEach(System.out::println);
    }
}