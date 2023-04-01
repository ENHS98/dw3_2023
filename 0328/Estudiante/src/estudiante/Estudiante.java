package estudiante;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double notaPromedio;
    
    public Estudiante(String nombre, String apellido, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }
    
    public Estudiante(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, 0.0);
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
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double getNotaPromedio() {
        return notaPromedio;
    }
    
    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }
}
