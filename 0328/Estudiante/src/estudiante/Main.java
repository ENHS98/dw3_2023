package estudiante;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de estudiantes y registrarlos
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 20, 8.5);
        Estudiante estudiante2 = new EstudianteInternacional("Pedro", "Garcia", 22, 7.8, "Mexico");
        Estudiante estudiante3 = new Estudiante("Ana", "Martinez", 19, 9.1);
        
        RegistroEstudiantes registro = new RegistroEstudiantes(10);
        registro.agregarEstudiante(estudiante1);
        registro.agregarEstudiante(estudiante2);
        registro.agregarEstudiante(estudiante3);
        
        // Buscar y mostrar información de un estudiante
        Estudiante encontrado = registro.buscarEstudiante("Pedro");
        if (encontrado != null) {
            System.out.println("Informacion del estudiante encontrado:");
            System.out.println("Nombre: " + encontrado.getNombre());
            System.out.println("Apellido: " + encontrado.getApellido());
            System.out.println("Edad: " + encontrado.getEdad());
            if (encontrado instanceof EstudianteInternacional) {
                System.out.println("Pais de origen: " + ((EstudianteInternacional) encontrado).getPaisDeOrigen());
            }
            System.out.println("Nota promedio: " + encontrado.getNotaPromedio());
        } else {
            System.out.println("El estudiante no fue encontrado.");
        }
        
        // Eliminar un estudiante y mostrar la lista actualizada
        registro.eliminarEstudiante("Juan");
        System.out.println("\nLista de estudiantes despues de eliminar a Juan:");
        for (int i = 0; i < registro.numEstudiantes; i++) {
            Estudiante e = registro.estudiantes[i];
            System.out.println(e.getNombre() + " " + e.getApellido() + ", Edad: " + e.getEdad());
        }
    }
}
