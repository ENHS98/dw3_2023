package estudiante;

public class RegistroEstudiantes {
    Estudiante[] estudiantes;
    int numEstudiantes;
    
    public RegistroEstudiantes(int tam) {
        estudiantes = new Estudiante[tam];
        numEstudiantes = 0;
    }
    
    public void agregarEstudiante(Estudiante e) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes] = e;
            numEstudiantes++;
        }
    }
    
    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                estudiantes[i] = estudiantes[numEstudiantes-1];
                estudiantes[numEstudiantes-1] = null;
                numEstudiantes--;
                break;
            }
        }
    }
    
    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }
}
