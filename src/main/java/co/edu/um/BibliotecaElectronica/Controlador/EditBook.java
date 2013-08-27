package co.edu.um.BibliotecaElectronica.Controlador;

import co.edu.um.BibliotecaElectronica.Modelo.ListaLibros;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 19/08/13
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */

/**
 * Aca utilizamos los parametros que se encuntra en la clase Libro y ListaLibros para
 * editar los libros que ya estan ingresados en la Biblioteca Electronica
 */
public class EditBook {

    public void editar(ListaLibros <String >lista, String isbn, String autor, String titulo, String fecha, String referencia, int numEjemplares){

        lista.editar(isbn,titulo,fecha,autor,referencia,numEjemplares);

    }



}
