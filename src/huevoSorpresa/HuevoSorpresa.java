// No se está usando un nombre convencional en el paquete.
package huevoSorpresa;

public class HuevoSorpresa {

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    // No se está usando un nombre convencional en la variable.
    private double precio_maxGutierrezMurilloFcoJavier2122;//precio máximo que puede tener un huevo sorpresa

    /*Constructor por defecto*/
    public HuevoSorpresa() {
    }


    /*Constructor por parámetros*/
    // No se está usando un nombre convencional en la variable.
    public HuevoSorpresa(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxGutierrezMurilloFcoJavier2122 = precio_max;
    }


    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/
    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/
    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/
    public String obtenerSorpresa() {
        return getSorpresa();
    }

    /* Método que permite modificar la sorpresa del huevo*/
    public void modificarSorpresa(String sorpresa) {
        this.setSorpresa(sorpresa);
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/
    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/
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


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/
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

    /**
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the sorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa the sorpresa to set
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return the precio_maxGutierrezMurilloFcoJavier2122
     */
    // No se está usando un nombre convencional en el método.
    public double getPrecio_maxGutierrezMurilloFcoJavier2122() {
        return precio_maxGutierrezMurilloFcoJavier2122;
    }

    /**
     * @param precio_maxGutierrezMurilloFcoJavier2122 the precio_maxGutierrezMurilloFcoJavier2122 to set
     */
     // No se está usando un nombre convencional en el método.
    public void setPrecio_maxGutierrezMurilloFcoJavier2122(double precio_maxGutierrezMurilloFcoJavier2122) {
        this.precio_maxGutierrezMurilloFcoJavier2122 = precio_maxGutierrezMurilloFcoJavier2122;
    }
}
