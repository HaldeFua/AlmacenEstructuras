public class Almacen {

    private Producto[][] matrizProductos;

    public Almacen() {
        matrizProductos = new Producto[6][5]; // Matriz de 6 filas y 5 columnas

        matrizProductos[0][0] = new Producto("Manzanas", 0.50, 100);
        matrizProductos[0][1] = new Producto("Bananas", 0.30, 150);
        matrizProductos[0][2] = new Producto("Naranjas", 0.60, 80);
        matrizProductos[0][3] = new Producto("Leche", 1.20, 60);
        matrizProductos[0][4] = new Producto("Queso", 2.50, 40);

        matrizProductos[1][0] = new Producto("Yogur", 1.00, 70);
        matrizProductos[1][1] = new Producto("Pan", 1.10, 90);
        matrizProductos[1][2] = new Producto("Arroz", 0.70, 200);
        matrizProductos[1][3] = new Producto("Pasta", 0.80, 120);
        matrizProductos[1][4] = new Producto("Pollo", 5.00, 50);

        matrizProductos[2][0] = new Producto("Carne", 7.00, 40);
        matrizProductos[2][1] = new Producto("Pescado", 6.50, 30);
        matrizProductos[2][2] = new Producto("Huevos", 2.20, 100);
        matrizProductos[2][3] = new Producto("Mantequilla", 1.80, 50);
        matrizProductos[2][4] = new Producto("Aceite", 3.00, 40);

        matrizProductos[3][0] = new Producto("Azúcar", 1.50, 80);
        matrizProductos[3][1] = new Producto("Sal", 0.90, 100);
        matrizProductos[3][2] = new Producto("Pimienta", 2.00, 60);
        matrizProductos[3][3] = new Producto("Café", 4.50, 70);
        matrizProductos[3][4] = new Producto("Té", 3.00, 90);

        matrizProductos[4][0] = new Producto("Jugo de Naranja", 2.50, 40);
        matrizProductos[4][1] = new Producto("Soda", 1.00, 120);
        matrizProductos[4][2] = new Producto("Cereal", 3.50, 60);
        matrizProductos[4][3] = new Producto("Chocolate", 2.20, 90);
        matrizProductos[4][4] = new Producto("Galletas", 1.50, 110);

        matrizProductos[5][0] = new Producto("Cerveza", 4.00, 50);
        matrizProductos[5][1] = new Producto("Vino", 10.00, 30);
        matrizProductos[5][2] = new Producto("Whisky", 25.00, 20);
        matrizProductos[5][3] = new Producto("Detergente", 5.00, 70);
        matrizProductos[5][4] = new Producto("Jabón", 1.00, 100);
    }

    public Producto[][] getMatrizProductos() {
        return matrizProductos;
    }

}
