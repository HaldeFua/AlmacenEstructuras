public class Producto {

    private String nombre;
    private double precio;
    private int cantida;

    public Producto(String nombre, double precio, int cantida){
        this.nombre = nombre;
        this.precio = precio;
        this.cantida = cantida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }
}
