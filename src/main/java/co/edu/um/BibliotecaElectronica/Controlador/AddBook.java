package co.edu.um.BibliotecaElectronica.Controlador;

import co.edu.um.BibliotecaElectronica.Modelo.ListaLibros;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 15/08/13
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
/*
 * este es el controlador en el cual utilizaremos los metodos para agregar libro desde la clase
 * ListaLibros y la ventana AddWindow
 */

public class AddBook {

    ListaLibros lista;

    String isbn, autor, titulo, fecha, referencia, numEjemplares, Combobox;

    public AddBook(ListaLibros lista, String isbn, String autor, String titulo, String fecha, String referencia, String numEjemplares, String combobox) {
        this.lista = lista;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
        this.referencia = referencia;
        this.numEjemplares = numEjemplares;
        Combobox = combobox;


    }
    public void guardar(){

        if(Combobox == "Insertar al inicio de la lista"){


            lista.insertarInicio(isbn,titulo, autor, fecha, Integer.parseInt(numEjemplares));

        }
        if(Combobox == "Insertar al fin de la lista"){


            lista.insertarEnFin(isbn,titulo, autor, fecha, Integer.parseInt(numEjemplares));

        }
        if(Combobox == "Insertar antes de la referencia"){


            lista.insertarAntes(isbn, titulo, fecha, autor, referencia, Integer.parseInt(numEjemplares));

        }
        if(Combobox == "Insertar despues de la referencia"){


            lista.insertarDespues(isbn, titulo, fecha, autor, referencia, Integer.parseInt(numEjemplares));

        }
    }
}
