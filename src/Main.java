public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        FiltroPorNombre filtro = new FiltroPorNombre(almacen.getMatrizProductos());

        filtro.filaYColumna();

    }
}