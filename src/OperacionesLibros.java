public class OperacionesLibros {

    private Libro[][] matrizLibro;

    public OperacionesLibros(Libro[][] matrizLibro) {
        this.matrizLibro = matrizLibro;
    }

    //precio del libro mas caro
    public void precioMasCaro(){

        double precioMasCaro = 0;
        String nombreMasCaro = "";

        for (int i = 0; i < matrizLibro.length; i++) {
            for (int j = 0; j < matrizLibro[i].length; j++) {

                if(precioMasCaro < matrizLibro[i][j].getPrecio()){

                    precioMasCaro = matrizLibro[i][j].getPrecio();
                    nombreMasCaro = matrizLibro[i][j].getTitulo();

                }

            }
        }

        System.out.println("El libro mas caro es " + nombreMasCaro);
        System.out.println("Su precio es " + precioMasCaro);

    }
}
