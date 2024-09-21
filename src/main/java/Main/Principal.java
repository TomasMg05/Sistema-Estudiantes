/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.EstudianteControlador;
import Vista.EstudianteVista;

public class Principal {
    public static void main(String[] args) {
        EstudianteVista vista = new EstudianteVista();
        
        new EstudianteControlador(vista);
    }
}

