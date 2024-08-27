import java.util.Scanner;

// Clase que contiene un operaciones para trabjar con los datos de una matriz
public class Operaciones {

    String nombreABuscar;
    Producto [][] matrizProducto;
    int fila;
    int columna;

    //metodo contrusctor, para construir un objetivo de clase Operaciones se debe ingresar siempre la matriz objetual
    public Operaciones(Producto[][] matrizProducto) {
        this.matrizProducto = matrizProducto;
    }

    // Metodo para buscar, con un nombre, en la matriz objetual, su posición en la matriz
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

    //Cancula la cantidad total de productos que hay
    public void totalInventario(){

        int totalInventario = 0;

        for (int i = 0; i < matrizProducto.length; i++) {
            for (int j = 0; j < matrizProducto[i].length; j++) {

                totalInventario += matrizProducto[i][j].getCantida();

            }
        }

        System.out.println("El total de productos es " + totalInventario);

    }


}
