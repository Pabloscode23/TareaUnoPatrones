package Logica;

public class Libro extends Producto implements InterfaceProducto{
    private int cantidadPaginas;

    public Libro(String nombre, int cantidadPaginas) {
        super(nombre);
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public void uso() {
        System.out.println("Libro presente");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "cantidadPaginas=" + cantidadPaginas +
                '}';
    }
}
