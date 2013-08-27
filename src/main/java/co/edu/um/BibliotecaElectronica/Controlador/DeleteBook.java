package co.edu.um.BibliotecaElectronica.Controlador;

import co.edu.um.BibliotecaElectronica.Modelo.ListaLibros;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 16/08/13
 * Time: 9:23
 * To change this template use File | Settings | File Templates.
 */

/**
 * en esta clase definimos el metodo de eliminar libro que se encuentra en ListaLibros
 */
public class DeleteBook {

public void eliminar(ListaLibros lista,String isbn){

    lista.eliminar(isbn);
      }

}
