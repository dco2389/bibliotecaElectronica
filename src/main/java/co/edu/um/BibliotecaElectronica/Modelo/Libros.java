package co.edu.um.BibliotecaElectronica.Modelo;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 14/08/13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
public class Libros <Libro> {


    public Libro isbn;
    public Libro titulo;
    public Libro autor;
    public Libro fecha;
    public int numEjemplar;
    Libros <Libro> siguiente;

    /**
     *
     * @param isbn esta es la referencia del libro
     * @param titulo este es el titulo del libro
     * @param autor este es el autor del libro
     * @param fecha esta es la fecha en la cual registran el libro
     * @param numEjemplar esta es la cantidad de libros que hay disponible de la misma clase
     * @param siguiente
     */


    public Libros(Libro isbn, Libro titulo, Libro autor, Libro fecha, int numEjemplar, Libros<Libro> siguiente) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.numEjemplar = numEjemplar;
        this.siguiente = siguiente;

    }

    public Libros(Libro isbn, Libro titulo, Libro autor, Libro fecha, int numEjemplar) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.numEjemplar = numEjemplar;
        this.siguiente = null;
    }
}
