/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huevoSorpresa;

/**
 * Clase main del programa, que define un objeto HuevoSorpresa con unos
 * parámetros y realiza acciones de sacar huevos sorpresas y aumentar el precio.
 *
 * @author Francisco JAvier Gutiérrez Murillo
 */
public class Main {

    /**
     * Método main. 
     * Este método es el principal de ejecución del programa
     */
    public static void main(String[] args) {
        HuevoSorpresa h_sorpresa;

        h_sorpresa = new HuevoSorpresa(10, 5, "peluche", 10);

        opera_PrecioGutierrezMurilloFcoJavier2122(h_sorpresa);

        opera_UnidadesGutierrezMurilloFcoJavier2122(h_sorpresa);

    }

    /**
     * Método opera_UnidadesGutierrezMurilloFcoJavier2122.
     *
     * En este método se va a intentar sacar 2 huevos sorpresa, como no hay
     * dinero suficiente saltará una excepción y no se modificará el nº de
     * unidades de la tienda.
     *
     * @param h_sorpresa objeto HuevoSorpresa.
     *
     * @throws Exception si la cantidad de dinero no es suficiente.
     */
    private static void opera_UnidadesGutierrezMurilloFcoJavier2122(HuevoSorpresa h_sorpresa) {
        /*Vamos a intentar sacar 2 huevos sorpresa, como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("Vamos a sacar huevos sorpresa");
            h_sorpresa.sacarHuevosSorpresas(2, 4, "llavero");
            System.out.println("Operación realizada, ahora tiene " + h_sorpresa.obtenerUnidades() + " unidades en la tienda");
        } catch (Exception e) {
            System.out.println("Error al sacar huevos sorpresa, el nº de unidades sigue siendo: " + h_sorpresa.obtenerUnidades());

        }
    }

    /**
     * Método opera_PrecioGutierrezMurilloFcoJavier2122.
     *
     * En este método se va a aumentar el precio 3€, como no supera el precio
     * máximo establecido la operación tendrá éxito y el nuevo precio será de
     * 8€.
     *
     * @param h_sorpresa objeto HuevoSorpresa.
     *
     * @throws Exception si la cantidad dinero a aumentar es errónea.
     */
    private static void opera_PrecioGutierrezMurilloFcoJavier2122(HuevoSorpresa h_sorpresa) {
        /*Vamos a aumentar el precio 3€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 8€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un huevo sorpresa");
            h_sorpresa.aumentarPrecio(3);
            System.out.println("El precio actual es " + h_sorpresa.obtenerPrecio() + " €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }

}
