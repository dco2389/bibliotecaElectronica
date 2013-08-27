package co.edu.um.BibliotecaElectronica.Modelo;

import org.junit.Test;

/**
 * acá se realizan las pruebas unitarias de la clase Lista libros
 */

public class ListaLibrosTest {
    @Test
    public void testInsertarInicio() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarInicio("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarInicio("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarInicio("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());

    }

    @Test
    public void testInsertarEnFin() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarEnFin("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarEnFin("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarEnFin("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());

    }

    @Test
    public void testBuscar() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarEnFin("+800", "Miguelito y su pato de juguete","Luis Carlos Correa","08/15/2013",4 );
        a.insertarEnFin("+900","Play Girls Versión Ingenieril","Daniel Ospina", "08/16/2013",5 );
        a.insertarEnFin("+1000","Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("el libro buscado fue:");
        System.out.println(a.buscar("+900").isbn.toString() +" "+ a.buscar("+900").autor.toString());

    }

    @Test
    public void testEliminar() throws Exception {
        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarEnFin("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarEnFin("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarEnFin("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());
        a.eliminar("+900");
        System.out.println("Estos son los libros eliminados: " + a.toString());
    }
    @Test
    public void testToString() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarInicio("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarInicio("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarInicio("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());
    }


    @Test
    public void testInsertarAntes() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarInicio("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarInicio("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarInicio("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());
        a.insertarAntes("+1100", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", "+800",7);
        System.out.println("Se muestra lo siguiente: " + a.toString());
    }

    @Test
    public void testInsertarDespues() throws Exception {

        ListaLibros<String> a = new ListaLibros<String>();
        a.insertarInicio("+800", "Miguelito y su pato de juguete", "Luis Carlos Correa", "08/15/2013", 4);
        a.insertarInicio("+900", "Play Girls Versión Ingenieril", "Daniel Ospina", "08/16/2013", 5);
        a.insertarInicio("+1000", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", 10);
        System.out.println("Estos son los libros overs!: " + a.toString());
        a.insertarDespues("+1100", "Sé lo que hicieron el verano pasado", "Andres Morales", "08/17/2013", "+1000",9);
        System.out.println("Se muestra lo siguiente: " + a.toString());
    }
}
