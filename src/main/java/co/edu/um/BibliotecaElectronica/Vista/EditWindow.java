package co.edu.um.BibliotecaElectronica.Vista;

import co.edu.um.BibliotecaElectronica.Controlador.AddBook;
import co.edu.um.BibliotecaElectronica.Controlador.EditBook;
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
 * Este es controlador donde utilizamos la clase ListaLibros y EditWindow para poder
 * editar libros
 */
public class EditWindow extends JFrame implements ActionListener{

    JLabel title = new JLabel("EDITAR LIBRO");
    JLabel lIsbn = new JLabel("ISBN:");
    JLabel lTitulo = new JLabel("TITULO:");
    JLabel lAutor = new JLabel("AUTOR:");
    JLabel lFecha = new JLabel("FECHA:");
    JLabel lNumEjemplares = new JLabel("NÚMERO DE EJEMPLARES:");
    JTextField textIsbn = new JTextField();
    JTextField textTitulo = new JTextField();
    JTextField textAutor = new JTextField();
    JTextField textFecha = new JTextField();
    JTextField textNumEjemplares = new JTextField();
    JButton cancel = new JButton("CANCELAR");
    JButton save = new JButton("GUARDAR");
    JLabel logo2;
    String refIsbn;

    ListaLibros <String>lista;


    public EditWindow (ListaLibros <String>lista, String refIsbn){
        super("AGREGAR LIBRO");
        this.refIsbn=refIsbn;
        //Adicion de los componentes Botones, y cajones de texto
        this.setLayout(null);
        this.lista = lista;

        title.setBounds(30, 10, 170, 70);
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


        this.setSize(800,500);



        save.addActionListener(this);


        //aca definimos el logo de la Universidad de Manizales

        Icon iconoEliminar = new ImageIcon(getClass().getResource("/images/manizales.jpg"));
        logo2 = new JLabel(iconoEliminar);
        logo2.setBounds(500,180,197,100);
        this.getContentPane().add(logo2);

    }
//clase donde ingresamos los parametros para editar los libros
    @Override
    public void actionPerformed(ActionEvent e) {
        String isbn, titulo, autor, fecha, numEjemplares, referencia, combobox;

        isbn          = textIsbn.getText();
        titulo        = textTitulo.getText();
        fecha         = textFecha.getText();
        numEjemplares = textNumEjemplares.getText();
        referencia    = refIsbn;
        autor         = textAutor.getText();

        //aca definimos el metodo para guardar la edicion del libro
        if(e.getSource()==save){

            EditBook savel = new EditBook();
            savel.editar(lista, isbn, autor, titulo, fecha, referencia,Integer.parseInt( numEjemplares));
            MainWindow save1 = new MainWindow(lista, String.valueOf(lista.totalLibros));
            save1.setVisible(true);
            this.setVisible(false);
        }
    }


}





