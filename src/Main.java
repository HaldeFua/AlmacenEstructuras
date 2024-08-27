public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        Operaciones filtro = new Operaciones(almacen.getMatrizProductos());

        //filtro.filaYColumna();
        //filtro.totalInventario();

        AlmacenLibros libros = new AlmacenLibros();
        OperacionesLibros opL = new OperacionesLibros(libros.getMatrizLibros());

        opL.precioMasCaro();

    }
}