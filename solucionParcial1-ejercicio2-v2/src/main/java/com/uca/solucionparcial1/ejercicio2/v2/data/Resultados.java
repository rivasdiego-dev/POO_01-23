
package com.uca.solucionparcial1.ejercicio2.v2.data;

public class Resultados {
    
    private static double salarioTotal;
    private static double descuentoISSS;
    private static double descuentoRenta;
    private static double descuentoAFP;
    private static double salarioLiquido;

    public static double getSalarioTotal() {
        return salarioTotal;
    }

    public static void setSalarioTotal(double salarioTotal) {
        Resultados.salarioTotal = salarioTotal;
    }

    public static double getDescuentoISSS() {
        return descuentoISSS;
    }

    public static void setDescuentoISSS(double descuentoISSS) {
        Resultados.descuentoISSS = descuentoISSS;
    }

    public static double getDescuentoRenta() {
        return descuentoRenta;
    }

    public static void setDescuentoRenta(double descuentoRenta) {
        Resultados.descuentoRenta = descuentoRenta;
    }

    public static double getDescuentoAFP() {
        return descuentoAFP;
    }

    public static void setDescuentoAFP(double descuentoAFP) {
        Resultados.descuentoAFP = descuentoAFP;
    }

    public static double getSalarioLiquido() {
        return salarioLiquido;
    }

    public static void setSalarioLiquido(double salarioLiquido) {
        Resultados.salarioLiquido = salarioLiquido;
    }

    

}
