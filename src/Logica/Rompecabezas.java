package Logica;

public class Rompecabezas extends Producto implements InterfaceProducto{
    private String estilo;

    public Rompecabezas(String nombre,String estilo) {
        super(nombre);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void uso() {
        System.out.println("Rompecabezas presente");
    }

    @Override
    public String toString() {
        return "Rompecabezas{" +
                "estilo='" + estilo + '\'' +
                '}';
    }
}
