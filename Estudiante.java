public class Estudiante {
    // 1. Atributos
    String nombre;
    int edad;

    // 2. Constructor por defecto que llama al parametrizado
    public Estudiante() {
        // El uso de this() aquí invoca al constructor de abajo
        this("Estudiante sin nombre", 18);
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. Método para imprimir detalles
    public void imprimirDetalles() {
        System.out.println("Nombre del Estudiante: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
    }

    // Ejemplo de ejecución
    public static void main(String[] args) {
        // Al usar el constructor vacío, se asignarán los valores "por defecto"
        Estudiante est1 = new Estudiante();
        est1.imprimirDetalles();
    }
}