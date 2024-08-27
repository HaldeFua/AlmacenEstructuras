public class AlmacenLibros {

    private Libro[][] matrizLibros;

    public AlmacenLibros(){

        matrizLibros = new Libro[10][5];

        matrizLibros[0][0] = new Libro("Cien años de soledad", "Gabriel García Márquez", 20.0);
        matrizLibros[0][1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 15.0);
        matrizLibros[0][2] = new Libro("Moby Dick", "Herman Melville", 18.0);
        matrizLibros[0][3] = new Libro("Orgullo y prejuicio", "Jane Austen", 22.0);
        matrizLibros[0][4] = new Libro("1984", "George Orwell", 17.0);

        matrizLibros[1][0] = new Libro("El gran Gatsby", "F. Scott Fitzgerald", 16.0);
        matrizLibros[1][1] = new Libro("Cumbres borrascosas", "Emily Brontë", 19.0);
        matrizLibros[1][2] = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 21.0);
        matrizLibros[1][3] = new Libro("La Odisea", "Homero", 25.0);
        matrizLibros[1][4] = new Libro("Ana Karenina", "León Tolstói", 24.0);

        matrizLibros[2][0] = new Libro("Ulises", "James Joyce", 28.0);
        matrizLibros[2][1] = new Libro("El retrato de Dorian Gray", "Oscar Wilde", 23.0);
        matrizLibros[2][2] = new Libro("Los hermanos Karamazov", "Fiódor Dostoyevski", 30.0);
        matrizLibros[2][3] = new Libro("Guerra y paz", "León Tolstói", 35.0);
        matrizLibros[2][4] = new Libro("El hombre invisible", "H.G. Wells", 18.0);

        matrizLibros[3][0] = new Libro("Mujer en punto cero", "Nawal El Saadawi", 22.0);
        matrizLibros[3][1] = new Libro("Siddhartha", "Hermann Hesse", 20.0);
        matrizLibros[3][2] = new Libro("El viejo y el mar", "Ernest Hemingway", 17.0);
        matrizLibros[3][3] = new Libro("El nombre de la rosa", "Umberto Eco", 25.0);
        matrizLibros[3][4] = new Libro("Los detectives salvajes", "Roberto Bolaño", 27.0);

        matrizLibros[4][0] = new Libro("La casa de los espíritus", "Isabel Allende", 23.0);
        matrizLibros[4][1] = new Libro("Pedro Páramo", "Juan Rulfo", 18.0);
        matrizLibros[4][2] = new Libro("Rayuela", "Julio Cortázar", 22.0);
        matrizLibros[4][3] = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 20.0);
        matrizLibros[4][4] = new Libro("El túnel", "Ernesto Sabato", 21.0);

        matrizLibros[5][0] = new Libro("La caverna", "José Saramago", 26.0);
        matrizLibros[5][1] = new Libro("El Aleph", "Jorge Luis Borges", 24.0);
        matrizLibros[5][2] = new Libro("Fahrenheit 451", "Ray Bradbury", 19.0);
        matrizLibros[5][3] = new Libro("Neuromante", "William Gibson", 21.0);
        matrizLibros[5][4] = new Libro("El psicoanalista", "John Katzenbach", 23.0);

        matrizLibros[6][0] = new Libro("Un mundo feliz", "Aldous Huxley", 22.0);
        matrizLibros[6][1] = new Libro("Dune", "Frank Herbert", 27.0);
        matrizLibros[6][2] = new Libro("El hobbit", "J.R.R. Tolkien", 25.0);
        matrizLibros[6][3] = new Libro("El señor de los anillos", "J.R.R. Tolkien", 35.0);
        matrizLibros[6][4] = new Libro("Ciclo de Marte", "Edgar Rice Burroughs", 30.0);

        matrizLibros[7][0] = new Libro("La mujer del viajero en el tiempo", "Audrey Niffenegger", 21.0);
        matrizLibros[7][1] = new Libro("Los pilares de la Tierra", "Ken Follett", 29.0);
        matrizLibros[7][2] = new Libro("El corredor del laberinto", "James Dashner", 19.0);
        matrizLibros[7][3] = new Libro("La chica del tren", "Paula Hawkins", 24.0);
        matrizLibros[7][4] = new Libro("La ladrona de libros", "Markus Zusak", 22.0);

        matrizLibros[8][0] = new Libro("El silmarillion", "J.R.R. Tolkien", 30.0);
        matrizLibros[8][1] = new Libro("El retrato de Dorian Gray", "Oscar Wilde", 23.0);
        matrizLibros[8][2] = new Libro("El gran Gatsby", "F. Scott Fitzgerald", 18.0);
        matrizLibros[8][3] = new Libro("El dios de las pequeñas cosas", "Arundhati Roy", 27.0);
        matrizLibros[8][4] = new Libro("El camino de los reyes", "Brandon Sanderson", 32.0);

        matrizLibros[9][0] = new Libro("Sombra sobre vidrio esmerilado", "Juan Manuel de Prada", 21.0);
        matrizLibros[9][1] = new Libro("El fin de la eternidad", "Isaac Asimov", 20.0);
        matrizLibros[9][2] = new Libro("La hija del relojero", "Kate Morton", 23.0);
        matrizLibros[9][3] = new Libro("El jardín de las sombras", "V.C. Andrews", 24.0);
        matrizLibros[9][4] = new Libro("Cruzada en jeans", "Thea Beckman", 18.0);

    }

    public Libro[][] getMatrizLibros() {
        return matrizLibros;
    }
}
