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
 * Aca definimos esta clase para utilizar un arreglo para mostrar los libros que buscamos
 * por medio de el ISBN
 */
public class SearchBook {

 public String [] llenarBusqueda(String isbn, ListaLibros lista){


     String arreglo [] = new String[5];
     arreglo[0] = lista.buscar(isbn).isbn.toString();
     arreglo[1] = lista.buscar(isbn).titulo.toString();
     arreglo[2] = lista.buscar(isbn).autor.toString();
     arreglo[3] = lista.buscar(isbn).fecha.toString();
     arreglo[4] = String.valueOf(lista.buscar(isbn).numEjemplar);

     return arreglo;
 }

}
