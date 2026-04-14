public class EjemploStatic {
    String nombre = "Objeto Ejemplo";

    // Método estático (de la clase)
    public static void metodoError() {
        // ERROR DE COMPILACIÓN:
        System.out.println(this.nombre);
    }
}