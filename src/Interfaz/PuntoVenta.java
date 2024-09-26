package Interfaz;

import Logica.InterfaceProducto;
import Logica.ProductoFactory;
import Logica.Controlador;
import Logica.Producto;

public class PuntoVenta {
    public static void main(String[] args) {
        Controlador controlador = Controlador.getInstance();

        InterfaceProducto factory = new ProductoFactory();

        controlador.agregarProducto(factory.crearProducto("Laptop"));
        controlador.agregarProducto(factory.crearProducto("Mouse"));
        controlador.agregarProducto(factory.crearProducto("Teclado"));

        int totalProductos = controlador.contarProductos();
        System.out.println("\nTotal de productos en la lista: " + totalProductos);

        System.out.println("\nLista de productos:");
        for (Producto producto : controlador.getProductos()) {
            System.out.println(producto.getNombre());
        }
    }
}
