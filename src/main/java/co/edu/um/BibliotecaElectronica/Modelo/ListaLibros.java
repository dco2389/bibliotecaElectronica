package co.edu.um.BibliotecaElectronica.Modelo;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 14/08/13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */

/**
 *
 * @param <Libro> lista generica
 * En esta clase vamos a utilizar los metodos que nos pregunta el taller de programacion III
 * de la biblioteca electronica
 */
public class ListaLibros <Libro> {

     public Libros <Libro> primero;
     public int totalLibros;


     public ListaLibros(){
        this.primero = null;
        this.totalLibros = 0;

    }

    public void insertarInicio (Libro isbn, Libro titulo, Libro autor, Libro fecha, int numEjemplar){
        Libros<Libro> nuevo = new Libros<Libro>(isbn, titulo, autor, fecha, numEjemplar);
        nuevo.siguiente = primero;
        primero = nuevo; this.totalLibros++;

    }

    public void insertarEnFin(Libro isbn, Libro titulo, Libro autor, Libro fecha, int numEjemplar){
        Libros<Libro> nl = new Libros<Libro>(isbn, titulo, autor, fecha, numEjemplar);
        this.totalLibros++;
        Libros<Libro> aux = primero;
        if(aux == null) primero = nl;
        else {
            while (aux.siguiente !=null) aux = aux.siguiente;
            //aux referencia al ultimo nodo de la lista
            aux.siguiente = nl;
        }
    }

    public Libros buscar (Libro isbn){

         Libros<Libro> aux = primero;
        while(aux !=null && !aux.isbn.equals(isbn)){

            aux = aux.siguiente;

        }
       return aux;
    }

    public int eliminar(Libro isbn){
        Libros<Libro> aux = primero, ant = null;
        while (aux != null && !aux.isbn.equals(isbn)){
            ant = aux; aux = aux.siguiente;
        }
        if (aux != null){
            this.totalLibros--;
            if(ant == null) primero = aux.siguiente;
            else ant.siguiente = aux.siguiente;
            return  1;
        }
        return 0;

    }

    public String toString(){
        String res = "";
        for(Libros<Libro> aux = primero; aux !=null; aux = aux.siguiente)
            res += aux.isbn.toString() +"           "+ aux.titulo.toString() +"       "+ aux.autor.toString() +"     "+ aux.fecha.toString() +"     "+ String.valueOf(aux.numEjemplar) +"\n";
        return res;
    }

    public boolean insertarAntes(Libro isbn, Libro titulo, Libro fecha, Libro autor, Libro refIsbn, int numlibros){

            Libros <Libro> aux = primero;

            while (aux!=null && !aux.isbn.equals(refIsbn)){
                aux=aux.siguiente;
            }

            if (aux!=null){

                Libro tempIsbn= aux.isbn;
                Libro tempTitulo= aux.titulo;
                Libro tempFecha= aux.fecha;
                Libro tempAutor= aux.autor;
                int tempNumLibros = aux.numEjemplar;

                aux.isbn=isbn;
                aux.titulo=titulo;
                aux.fecha=fecha;
                aux.autor=autor;
                aux.numEjemplar=numlibros;

                insertarDespues(tempIsbn,tempTitulo,tempFecha,tempAutor,isbn, tempNumLibros);
                this.totalLibros++;
                return true;



            }else{
                   return false;
                 }

    }

    public boolean insertarDespues(Libro isbn, Libro titulo, Libro fecha, Libro autor, Libro refIsbn, int numlibros){


            Libros<Libro> aux=primero;
            Libros<Libro> nuevo= new Libros<Libro>(isbn,titulo,fecha,autor, numlibros);

            while (aux!=null && !aux.isbn.equals(refIsbn)){
                aux=aux.siguiente;
            }
            if (aux!=null){
                nuevo.siguiente=aux.siguiente;
                aux.siguiente=nuevo;
                this.totalLibros++;
                return true;
            } else return false;
    }

    public void editar(Libro isbn, Libro titulo, Libro fecha, Libro autor, Libro refIsbn, int numlibros){
        Libros libro = buscar(refIsbn);
        libro.isbn = isbn;
        libro.titulo = titulo;
        libro.autor = autor;
        libro.fecha = fecha;
        libro.numEjemplar = numlibros;
    }


}
