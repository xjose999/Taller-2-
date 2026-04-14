public class Producto {
    // 1. Atributos (Propiedades)
    String nombre;
    double precio;

    // 2. Constructor parametrizado
    public Producto(String nombre, double precio) {
        // 'this.nombre' es el atributo de la clase
        // 'nombre' es el dato que llega por el paréntesis
        this.nombre = nombre;
        this.precio = precio;
    }

    // 3. Método para mostrar detalles
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + " | Precio: $" + this.precio);
    }

    // Ejemplo de uso rápido
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop ASUS", 2500000);
        p1.mostrarProducto();
    }
}