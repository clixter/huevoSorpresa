// No se está usando un nombre convencional en el paquete.
package huevoSorpresa;

/**
 * Clase que representa un conjunto de huevos sorpresa. Contendrá información
 * relativa al número de huevos, precio, sorpresa y precio máximo.
 *
 * @author Francisco Javier Gutiérrez Murillo.
 */
public class HuevoSorpresa {

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    // No se está usando un nombre convencional en la variable.
    private double precio_maxGutierrezMurilloFcoJavier2122;//precio máximo que puede tener un huevo sorpresa

    // Constructores
    // -------------
    /*Constructor por defecto*/
    /**
     * Constructor de Huevo Sorpresa sin parámetros.
     *
     */
    public HuevoSorpresa() {
    }

    // Constructor con cuatro parámetros
    /**
     * Constructor de Huevo Sorpresa con cuatro parámetros.
     *
     * @param unidades Número de unidades.
     * @param precio Precio del Huevo Sorpresa.
     * @param sorpresa Sorpresa del Huevo.
     * @param precio_max Precio máximo.
     */
    // No se está usando un nombre convencional en la variable.
    public HuevoSorpresa(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxGutierrezMurilloFcoJavier2122 = precio_max;
    }

    // Método obtenerUnidades
    /**
     * Obtiene el número de huevos sorpresa que tiene la tienda.
     *
     * @return Número de huevos sorpresa que tiene la tienda.
     */
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    // Método obtenerPrecio
    /**
     * Obtiene el precio que tiene el huevo sorpresa.
     *
     * @return Precio que tiene cada huevo sorpresa.
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }

    // Método obtenerSorpresa
    /**
     * Obtiene la sorpresa que tiene el huevo.
     *
     * @return Sorpresa que tiene el huevo.
     */
    public String obtenerSorpresa() {
        return getSorpresa();
    }

    // Método modificarSorpresa
    /**
     * Modifica la sorpresa que tiene el huevo.
     *
     * @param sorpresa Sorpresa del Huevo.
     *
     */
    public void modificarSorpresa(String sorpresa) {
        this.setSorpresa(sorpresa);
    }

    // Método modificarUnidades
    /**
     * Modifica el número de huevos sorpresa que tiene la tienda.
     *
     * @param unidades Número de huevos.
     *
     */
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
    suficientes unidades en la tienda*/
    /**
     * Saca huevos sorpresa si se tiene suficiente dinero y hay suficientes
     * unidades en la tienda
     *
     * @param unidades Huevos a aumentar.
     * @param dinero Dinero a aumentar.
     * @param sorpresaGutierrezMurilloFcoJavier2122 Precio a aumentar.
     *
     * @throws Exception si la cantidad de dinero a aumentar o de huevos es
     * incorrecta.
     */
    // No se debe de usar la Exception genérica y no se está usando un nombre convencional en la variable.
    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaGutierrezMurilloFcoJavier2122) throws Exception {
        if (dinero <= 0) {
            // No se debe de usar la Exception genérica.
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            // No se debe de usar la Exception genérica.
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            // No se debe de usar la Exception genérica.
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.getUnidades() <= unidades) {
            // No se debe de usar la Exception genérica.
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /*Método que permite aumentar el precio de venta de un huevo sorpresa. Suma al precio actual el
     aumento que se indica siempre que no se sobrepase el precio máximo de
     venta. descripcion Descripcion del dispositivo.*/
    /**
     * Aumenta el precio de venta de un huevo sorpresa. Suma al precio actual el
     * aumento que se indica siempre que no se sobrepase el precio máximo de
     * venta. descripcion Descripcion del dispositivo.
     *
     * @param aumento Precio a aumentar.
     * @throws Exception si el Precio a aumentar es negativo o superior al
     * máximo..
     */
    // No se debe de usar la Exception genérica.
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            // No se debe de usar la Exception genérica.
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxGutierrezMurilloFcoJavier2122() < getPrecio() + aumento) {
            // No se debe de usar la Exception genérica.
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    // Método getUnidades
    /**
     * Obtiene el número de huevos que quedan.
     *
     * @return Número de huevos que quedan.
     */
    public int getUnidades() {
        return unidades;
    }

    // Método setUnidades
    /**
     * Modifica el número de huevos que quedan.
     *
     * @param unidades Número de huevos que quedan.
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    // Método getPrecio
    /**
     * Obtiene el precio actual del huevo.
     * @return Precio actual del Huevo.
     */
    public double getPrecio() {
        return precio;
    }

    // Método setPrecio
    /**
     * Modifica el precio actual del huevo.
     *
     * @param precio Precio actual del huevo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método getSorpresa
    /**
     * Obtiene la sorpresa del huevo.
     * @return Sorpresa del Huevo.
     */
    public String getSorpresa() {
        return sorpresa;
    }

    // Método setSorpresa
    /**
     * Modifica la sorpresa del huevo.
     *
     * @param sorpresa Sorpresa del huevo.
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    // Método getPrecio_maxGutierrezMurilloFcoJavier2122
    /**
     * Obtiene el precio máximo del huevo.
     * @return Precio máximo que puede tener un huevo sorpresa.
     */
    // No se está usando un nombre convencional en el método.
    public double getPrecio_maxGutierrezMurilloFcoJavier2122() {
        return precio_maxGutierrezMurilloFcoJavier2122;
    }

    // Método setPrecio_maxGutierrezMurilloFcoJavier2122
    /**
     * Modifica el precio máximo del huevo sorpresa.
     *
     * @param precio_maxGutierrezMurilloFcoJavier2122 Precio máximo que puede
     * tener un huevo sorpresa.
     */
    // No se está usando un nombre convencional en el método.
    public void setPrecio_maxGutierrezMurilloFcoJavier2122(double precio_maxGutierrezMurilloFcoJavier2122) {
        this.precio_maxGutierrezMurilloFcoJavier2122 = precio_maxGutierrezMurilloFcoJavier2122;
    }
}
