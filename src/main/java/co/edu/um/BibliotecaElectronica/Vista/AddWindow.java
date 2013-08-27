package co.edu.um.BibliotecaElectronica.Vista;

import co.edu.um.BibliotecaElectronica.Controlador.AddBook;
import co.edu.um.BibliotecaElectronica.Modelo.Libros;
import co.edu.um.BibliotecaElectronica.Modelo.ListaLibros;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created with IntelliJ IDEA.
 * @autor Daniel Cardona Olaya
 * Date: 14/08/13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */

/**
 * Aca se se trabaja en forma de formulario para agregar los parametros que tenemos
 * en la clase Libros y listaLibros
 */
public class AddWindow extends JFrame implements ActionListener, ItemListener{

    JLabel title = new JLabel("AGREGAR LIBRO");
    JLabel lIsbn = new JLabel("ISBN:");
    JLabel lTitulo = new JLabel("TITULO:");
    JLabel lAutor = new JLabel("AUTOR:");
    JLabel lFecha = new JLabel("FECHA:");
    JLabel lNumEjemplares = new JLabel("NÚMERO DE EJEMPLARES:");
    JLabel referencia = new JLabel("REFERENCIA:");
    JTextField textIsbn = new JTextField();
    JTextField textTitulo = new JTextField();
    JTextField textAutor = new JTextField();
    JTextField textFecha = new JTextField();
    JTextField textNumEjemplares = new JTextField();
    JTextField textreferencia = new JTextField();
    JButton cancel = new JButton("CANCELAR");
    JButton save = new JButton("GUARDAR");
    JComboBox opciones = new JComboBox();
    JLabel logo2;


    ListaLibros <String>lista;


    public AddWindow(ListaLibros <String>lista){
        super("AGREGAR LIBRO");
        //Adicion de los componentes Botones, y cajones de texto
        this.setLayout(null);
        this.lista = lista;

        title.setBounds(30, 10, 170, 70);
        opciones.setBounds(120,90,200,30);
        lIsbn.setBounds(55,140,240,30);
        lTitulo.setBounds(55,190,250,30);
        lAutor.setBounds(55,240,210,30);
        lFecha.setBounds(55,290,210,30);
        lNumEjemplares.setBounds(55,330,210,30);
        textIsbn.setBounds(120,140,250,30);
        textTitulo.setBounds(120,190,250,30);
        textAutor.setBounds(120,240,250,30);
        textFecha.setBounds(120,290,250,30);
        textNumEjemplares.setBounds(220,330,35,30);
        cancel.setBounds(470,390,100,30);
        save.setBounds(620,390,100,30);
        referencia.setBounds (380,90,220,30);
        textreferencia.setBounds(480,90,250,30);


        this.getContentPane().add(title);
        this.getContentPane().add(lIsbn);
        this.getContentPane().add(lTitulo);
        this.getContentPane().add(lAutor);
        this.getContentPane().add(lFecha);
        this.getContentPane().add(lNumEjemplares);
        this.getContentPane().add(textIsbn);
        this.getContentPane().add(textTitulo);
        this.getContentPane().add(textAutor);
        this.getContentPane().add(textFecha);
        this.getContentPane().add(textNumEjemplares);
        this.getContentPane().add(cancel);
        this.getContentPane().add(save);
        this.getContentPane().add(opciones);
        this.getContentPane().add(referencia);
        this.getContentPane().add(textreferencia);

        this.setSize(800,500);

        opciones.addItem("Insertar al inicio de la lista");
        opciones.addItem("Insertar al fin de la lista");
        opciones.addItem("Insertar antes de la referencia");
        opciones.addItem("Insertar despues de la referencia");

        save.addActionListener(this);

        //aca definimos el logo de la Universidad de Manizales

        Icon iconoEliminar = new ImageIcon(getClass().getResource("/images/manizales.jpg"));
        logo2 = new JLabel(iconoEliminar);
        logo2.setBounds(500,180,197,100);
        this.getContentPane().add(logo2);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String isbn, titulo, autor, fecha, numEjemplares, referencia, combobox;

        isbn          = textIsbn.getText();
        titulo        = textTitulo.getText();
        fecha         = textFecha.getText();
        numEjemplares = textNumEjemplares.getText();
        referencia    = textreferencia.getText();
        autor         = textAutor.getText();
        combobox      = String.valueOf(opciones.getSelectedItem());

        //este es el metodo en el cual vamos a guardar los datos introducidos en el formulario de la ventana de anadir libro
        if(e.getSource()==save){

            AddBook savel = new AddBook(lista, isbn, autor, titulo, fecha, referencia, numEjemplares, combobox);
            savel.guardar();
            MainWindow save1 = new MainWindow(lista,String.valueOf(lista.totalLibros));
            save1.setVisible(true);
            this.setVisible(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getSource()== opciones){


        }
    }
}
