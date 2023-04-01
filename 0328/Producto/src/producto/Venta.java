package producto;

import java.util.Arrays;

public class Venta {
    private Producto[] productos;

    public Venta(Producto[] productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto nuevoProducto) {
        Producto[] nuevosProductos = Arrays.copyOf(productos, productos.length + 1);
        nuevosProductos[nuevosProductos.length - 1] = nuevoProducto;
        productos = nuevosProductos;
    }

    public void eliminarProducto(String nombre) {
        int indiceProducto = buscarProducto(nombre);
        if (indiceProducto != -1) {
            Producto[] nuevosProductos = new Producto[productos.length - 1];
            int j = 0;
            for (int i = 0; i < productos.length; i++) {
                if (i != indiceProducto) {
                    nuevosProductos[j] = productos[i];
                    j++;
                }
            }
            productos = nuevosProductos;
        }
    }

    public int buscarProducto(String nombre) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void ordenarProductosPorPrecio() {
        Arrays.sort(productos);
    }

    Iterable<Producto> getProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


