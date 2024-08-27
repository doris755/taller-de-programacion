package modelo;

public class Persona {
    private  long id;
    private String nombre;
    public String apellido;
    private int edad;
    private String direccion;

    public Persona() {
    }

    public Persona(long id, String nombre, String apellido, int edad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public  String caminar(){
        return "camina";
    }
}








