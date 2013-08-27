package co.edu.um.BibliotecaElectronica.Vista;
import co.edu.um.BibliotecaElectronica.Controlador.AddBook;
import co.edu.um.BibliotecaElectronica.Controlador.DeleteBook;
import co.edu.um.BibliotecaElectronica.Controlador.SearchBook;
import co.edu.um.BibliotecaElectronica.Modelo.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 14/08/13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */

/**
 * Aca definimos la ventana principal de nuestro programa, donde ejecutaremos todos los
 * metodos que trabajamos en el paquete MODELO
 */
public class MainWindow extends JFrame implements ActionListener{


        JLabel title = new JLabel("BIBLIOTECA ELECTRÓNICA UM");
        JLabel title2 = new JLabel ("INFORMACIÓN DEL LIBRO");
        JLabel labelBuscar = new JLabel("Ingrese el ISBN del libro que desea buscar:");
        JLabel labelDelete = new JLabel("Ingrese el ISBN del libro que desea eliminar:");
        JButton add  = new JButton("ADICIONAR LIBRO");
        JButton edit = new JButton("EDITAR INFORMACIÓN DEL LIBRO");
        JButton bus  = new JButton("BUSCAR LIBRO");
        JButton del  = new JButton("ELIMINAR LIBRO");
        JButton salir = new JButton("SALIR");
        JLabel contador2 = new JLabel(" ");
        JLabel contador = new JLabel("Numero total de libros: ");
        JTextField textBuscar = new JTextField();
        JTextField textDelete = new JTextField();
        JTextArea textoLista;
        JLabel logo1;

        //Campos de texto para visualizar la busqueda

        JLabel searchIsbn = new JLabel();
        JLabel searchTitulo = new JLabel();
        JLabel searchAutor = new JLabel();
        JLabel searchFecha = new JLabel();
        JLabel searchNumEjemplares = new JLabel();

    //Encabezados de la lista
        JLabel encabezado1 = new JLabel("Referencia  || ");
        JLabel encabezado2 = new JLabel ("    Título   || ");
        JLabel encabezado3 = new JLabel ("     Autor  || ");
        JLabel encabezado4 = new JLabel ("     Fecha   || ");
        JLabel encabezado5 = new JLabel ("       No. de Ejemplares  ||");

        ListaLibros<String>lista;

    public String getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(String numeroLibros) {
        this.numeroLibros = numeroLibros;
        contador2.setText(this.getNumeroLibros());
    }

    //declaracion de la variable para el contador de libros
         private String numeroLibros;


        public MainWindow(ListaLibros<String>lista, String numeroLibros){
            super("LIBROS ELECTRÓNICOS UM");

            this.setNumeroLibros(numeroLibros);

            contador2.setText(this.getNumeroLibros());


            //Adicion de los componentes Botones, y cajones de texto

            this.setLayout(null);
            this.lista = lista;
            textoLista = new JTextArea(lista.toString());
            textoLista.setBounds(30,100,700,250);

            title.setBounds(30, 10, 260, 70);
            title2.setBounds(30,350,240,70);
            textBuscar.setBounds(1015,250,240,30);
            textDelete.setBounds(1015,375,240,30);
            labelBuscar.setBounds(1015,225,250,30);
            labelDelete.setBounds(1015, 350, 250, 30);
            add.setBounds(1030,175,210,30);
            edit.setBounds(500,580,250,30);
            bus.setBounds(1030,300,210,30);
            del.setBounds(1030,425,210,30);
            salir.setBounds(1120,600,100,30);
            contador.setBounds(30,600,150,50);
            contador2.setBounds(170,600,150,50);

            searchIsbn.setBounds(30, 420, 300, 30);
            searchTitulo.setBounds(30, 450, 300, 30);
            searchAutor.setBounds(30, 480, 300, 30);
            searchFecha.setBounds(30, 510, 300, 30);
            searchNumEjemplares.setBounds(30, 540, 200, 30);

            //Parametros de los encabezados la lista donde se muestran lo libros

            encabezado1.setBounds(30,40,100,100);
            encabezado2.setBounds(100,40,100,100);
            encabezado3.setBounds(150,40,100,100);
            encabezado4.setBounds(200,40,100,100);
            encabezado5.setBounds(250,40,140,100);
            this.getContentPane().add(encabezado1);
            this.getContentPane().add(encabezado2);
            this.getContentPane().add(encabezado3);
            this.getContentPane().add(encabezado4);
            this.getContentPane().add(encabezado5);



            this.getContentPane().add(title);
            this.getContentPane().add(title2);
            this.getContentPane().add(textDelete);
            this.getContentPane().add(textBuscar);
            this.getContentPane().add(labelBuscar);
            this.getContentPane().add(labelDelete);
            this.getContentPane().add(edit);
            this.getContentPane().add(add);
            this.getContentPane().add(bus);
            this.getContentPane().add(del);
            this.getContentPane().add(salir);
            this.getContentPane().add(textoLista);
            this.getContentPane().add(contador);
            this.getContentPane().add(contador2);

            this.getContentPane().add(searchIsbn);
            this.getContentPane().add(searchTitulo);
            this.getContentPane().add(searchAutor);
            this.getContentPane().add(searchFecha);
            this.getContentPane().add(searchNumEjemplares);

            title2.setVisible(false);
            edit.setVisible(false);

            this.setSize(1300,700);

            //aca se define el tipo de letra para cada uno de los anuncios

            Font letra1= new Font ("Verdana", Font.BOLD, 15);
            title.setFont(letra1);
            Font letra2= new Font ("Verdana", Font.BOLD, 15);
            title2.setFont(letra2);

            //Adicionamos eventos los botones

            bus.addActionListener(this);
            edit.addActionListener(this);
            add.addActionListener(this);
            del.addActionListener(this);

            //Aca invocamos el button de salir para ejecutar la accion
            salir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    salirActionPerformed(e);
                }
            });

            //aca definimos el logo de la Universidad de Manizales

            Icon iconoEliminar = new ImageIcon(getClass().getResource("/images/manizales.jpg"));
            logo1 = new JLabel(iconoEliminar);
            logo1.setBounds(1038,40,197,100);
            this.getContentPane().add(logo1);
        }
        //metodos para abrir ventanas para agregar libro, buscar y editar.
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            if(actionEvent.getSource()==bus){

               String valorBusqueda = textBuscar.getText();

               SearchBook isbn = new SearchBook();

                String arreglo1 [] = isbn.llenarBusqueda(valorBusqueda, lista);

               searchIsbn.setText("ISBN:  " + arreglo1[0]);
               searchTitulo.setText("TITULO:  " + arreglo1 [1]);
               searchAutor.setText("AUTOR:  " + arreglo1 [2]);
               searchFecha.setText("FECHA:  " + arreglo1 [3]);
               searchNumEjemplares.setText("NÚMERO DE EJEMPLARES:  " + arreglo1 [4]);
               searchIsbn.setVisible(true);
               searchTitulo.setVisible(true);
               searchAutor.setVisible(true);
               searchFecha.setVisible(true);
               searchNumEjemplares.setVisible(true);
               edit.setVisible(true);
               title2.setVisible(true);
            }

            //accion para la fase de agregar libro
            if(actionEvent.getSource()==add){
                AddWindow abrir = new AddWindow(lista);
                abrir.setVisible(true);
            }
            //accion para la fase de editar libro
            if(actionEvent.getSource()==edit){
                EditWindow abrir = new EditWindow(lista,textBuscar.getText());
                abrir.setVisible(true);

            //accion para la fase de eliminar libro
            }
            if(actionEvent.getSource()==del){
                DeleteBook abrir = new DeleteBook();
                abrir.eliminar(lista, textDelete.getText());

                MainWindow ventana = new MainWindow(lista, String.valueOf(lista.totalLibros));
                ventana.setVisible(true);
                this.setVisible(false);
            }
        }
         //Sirve para llamar el metodo de salida del programa
         public void salirActionPerformed(ActionEvent e){

             System.exit(0);
         }

}

