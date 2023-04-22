
package com.uca.solucionparcial1.ejercicio2.v2.data;

public class Datos {
    private static int horasNormales;
    private static int horasExtra;
    public final static double PAGO_POR_HORA = 3.75;
    public final static double PAGO_POR_HORA_EXTRA = 7.5;

    public static int getHorasNormales() {
        return horasNormales;
    }

    public static void setHorasNormales(int horasNormales) {
        Datos.horasNormales = horasNormales;
    }

    public static int getHorasExtra() {
        return horasExtra;
    }

    public static void setHorasExtra(int horasExtra) {
        Datos.horasExtra = horasExtra;
    }        
    
}
