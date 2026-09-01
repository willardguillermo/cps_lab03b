package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String carrera;

    public StudentEntity() {
    }

    public StudentEntity(Long id, String nombre, String apellido, String email, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.carrera = carrera;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "StudentEntity{id=" + id + ", nombre='" + nombre + "', apellido='" + apellido + "', email='" + email + "', carrera='" + carrera+ "'}";
    }
}