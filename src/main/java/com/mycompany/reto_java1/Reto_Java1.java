/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_java1;

/**
 *
 * @author santi
 */
public class Reto_Java1 {

    public static void main(String[] args) {
        System.out.println("Inicializando volumen con valor inválido:");
        System.out.println("150");

        ControladorVolumen controlador = new ControladorVolumen(150);

        System.out.println("Volumen ajustado a valor por defecto: "
                + controlador.getNivel());

        System.out.println("\nIntentando subir volumen en 60...");
        controlador.subirVolumen(60);

        System.out.println("\nBajando volumen en 20...");
        controlador.bajarVolumen(20);

        System.out.println();
        controlador.mostrarEstado();
    }

    // Clase que controla el volumen
    static class ControladorVolumen {

        // Atributo privado
        private int nivel;

        // Constructor
        public ControladorVolumen(int nivel) {
            if (nivel >= 0 && nivel <= 100) {
                this.nivel = nivel;
            } else {
                this.nivel = 50;
            }
        }

        // Aumenta el volumen si no supera 100
        public void subirVolumen(int cantidad) {
            if (cantidad > 0 && nivel + cantidad <= 100) {
                nivel += cantidad;
                System.out.println("Volumen aumentado a: " + nivel);
            } else {
                System.out.println("Operación no realizada:");
                System.out.println("Volumen máximo permitido es 100");
            }
        }

        // Disminuye el volumen si no baja de 0
        public void bajarVolumen(int cantidad) {
            if (cantidad > 0 && nivel - cantidad >= 0) {
                nivel -= cantidad;
                System.out.println("Volumen actual: " + nivel);
            } else {
                System.out.println("Operación no realizada:");
                System.out.println("El volumen mínimo permitido es 0");
            }
        }

        // Retorna el nivel actual
        public int getNivel() {
            return nivel;
        }

        // Muestra el estado actual
        public void mostrarEstado() {
            System.out.println("Volumen actual: " + nivel);
        }
    }
}