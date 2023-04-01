package producto;

public class Main {
    public static void main(String[] args) {
        // Creamos algunos productos
        Producto p1 = new Producto("Leche", "Leche entera en botella de 1 litro", 50.0, 10);
        Producto p2 = new Producto("Pan", "Pan francés recién horneado", 30.0, 20);
        Producto p3 = new Producto("Jabón", "Jabón de tocador con aloe vera", 15.0, 5);

        // Creamos una venta y agregamos algunos productos
        Venta venta = new Venta(new Producto[]{p1, p2});
        venta.agregarProducto(p3);

        // Ordenamos los productos por precio y los mostramos
        venta.ordenarProductosPorPrecio();
        System.out.println("Productos ordenados por precio:");
        for (Producto producto : venta.getProductos()) {
            System.out.println(producto.getNombre() + " - $" + producto.getPrecio());
        }

        // Buscamos un producto y lo eliminamos
        int indiceProducto = venta.buscarProducto("Pan");
        if (indiceProducto != -1) {
            venta.eliminarProducto("Pan");
            System.out.println("Producto eliminado");
        } else {
            System.out.println("Producto no encontrado");
        }

        // Calculamos el costo de envío para una dirección y una distancia dada
        Envio envio = new Envio("Calle Falsa 123");
        double distancia = 10.0;
        double costoEnvio = envio.calcularCostoEnvio(distancia);
        System.out.println("El costo de envío a la dirección " + envio.getDireccion() + " es de $" + costoEnvio + " para una distancia de " + distancia + " km");
    }
}
