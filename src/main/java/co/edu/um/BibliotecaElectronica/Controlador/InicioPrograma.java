package co.edu.um.BibliotecaElectronica.Controlador;

import co.edu.um.BibliotecaElectronica.Modelo.ListaLibros;
import co.edu.um.BibliotecaElectronica.Vista.AddWindow;
import co.edu.um.BibliotecaElectronica.Vista.MainWindow;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 14/08/13
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */

/**
 * Aca utilizamos codigo para mostrar las ventanas y para mostrar una lista
 * de libros predeterminados
 */
public class InicioPrograma {

    public static void main(String[] args) {

        ListaLibros <String> lista = new ListaLibros<String>();

        lista.insertarInicio("AC1001",  "Asesoria salvaje del Pava y sus amigos", "Gabo",           "15/08/2013",5);
        lista.insertarInicio("AC1002",  "Hoy trasnochare hasta las 7",            "Cliper",         "16/08/2013",6);
        lista.insertarInicio("AC1003",  "Sex And The City",                       "Mister Albeiro", "17/08/2013",8);
        lista.insertarInicio("AC1004",  "Olivanders",                             "Ganzua",         "18/08/2013",7);
        lista.insertarInicio("AC1005",  "Super intrepidas en el hoyo negro",      "MInifull",       "19/08/2013",10);
        lista.insertarInicio("AC1006",  "Falcao y su penalti estrella",           "Policarpa y sus viciosas",  "20/08/2013",15);



        MainWindow ejecutar = new MainWindow(lista, String.valueOf(lista.totalLibros));

        ejecutar.setNumeroLibros(String.valueOf(lista.totalLibros));
        ejecutar.setVisible(true);

        AddWindow ejecutar2 = new AddWindow(lista);
        ejecutar2.setVisible(false);

    }


}


