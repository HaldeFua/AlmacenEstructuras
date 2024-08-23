import java.util.Scanner;

public class FiltroPorNombre {

    String nombreABuscar;
    Producto [][] matrizProducto;
    int fila;
    int columna;

    public FiltroPorNombre(Producto[][] matrizProducto) {
        this.matrizProducto = matrizProducto;
    }

    public void filaYColumna(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un producto");
        nombreABuscar = scan.nextLine();

        for (int i = 0; i < matrizProducto.length; i++) {
            for (int j = 0; j < matrizProducto[i].length; j++) {
                if(nombreABuscar.equals(matrizProducto[i][j].getNombre())){
                    fila = i;
                    columna = j;
                    break;
                }
            }
        }

        System.out.println("El producto " + nombreABuscar + " está en la fila " + fila + " y columna " + columna);

    }

}
