/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Vista.EstudianteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteControlador implements ActionListener {
    private EstudianteVista vista;
    private Estudiante modelo;

    public EstudianteControlador(EstudianteVista vista) {
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnMostrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            modelo = new Estudiante(
                vista.txtCodigo.getText(),
                vista.txtNombre.getText(),
                vista.txtApellido.getText(),
                vista.txtDireccion.getText(),
                vista.txtTelefono.getText()
            );
            vista.areaMostrar.setText("Estudiante agregado correctamente.");
        } else if (e.getSource() == vista.btnMostrar) {
            if (modelo != null) {
                vista.areaMostrar.setText("Nombre Completo: " + modelo.nombreCompleto());
            } else {
                vista.areaMostrar.setText("No hay estudiante registrado.");
            }
        }
    }
}

