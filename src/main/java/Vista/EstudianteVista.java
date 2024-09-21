/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;
import java.awt.*;

public class EstudianteVista extends JFrame {
    public JTextField txtCodigo = new JTextField(20);
    public JTextField txtNombre = new JTextField(20);
    public JTextField txtApellido = new JTextField(20);
    public JTextField txtDireccion = new JTextField(20);
    public JTextField txtTelefono = new JTextField(20);
    public JButton btnAgregar = new JButton("Agregar");
    public JButton btnMostrar = new JButton("Mostrar");
    public JTextArea areaMostrar = new JTextArea(5, 24);

    public EstudianteVista() {
        setTitle("Formulario de Estudiante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Codigo"));
        add(txtCodigo);
        add(new JLabel("Nombre"));
        add(txtNombre);
        add(new JLabel("Apellido"));
        add(txtApellido);
        add(new JLabel("Direccion"));
        add(txtDireccion);
        add(new JLabel("Telefono"));
        add(txtTelefono);
        add(btnAgregar);
        add(btnMostrar);
        add(new JScrollPane(areaMostrar));

        setVisible(true);
    }
}

