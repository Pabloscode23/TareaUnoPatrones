package Logica;

import java.util.ArrayList;

public class Controlador {
    private static Controlador controlador;
    private ArrayList<Producto> productos;

    private Controlador() {
        productos = new ArrayList<>();
    }

    public static Controlador getInstance() {
        if (controlador == null) {
            controlador = new Controlador();
        }

        return controlador;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int contarProductos() {
        return productos.size();
    }
}
