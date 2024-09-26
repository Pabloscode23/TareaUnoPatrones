package Logica;

public class ProductoFactory implements InterfaceProducto {
    @Override
    public Producto crearProducto(String nombre) {
        return new Producto(nombre);
    }
}