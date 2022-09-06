package Complejidad;

public class Algoritmo1 {
    /* Algoritmo 1. Se utiliza un ciclo for para realizar la suma */
    public double Sumar (double n) {
        double tiempoInicial = System.nanoTime();
        double suma = 0;
        for (double x = 1; x <= n+1; x++){
            suma += x;
        }
        double tiempoFinal = System.nanoTime();
        double tiempoEjecución = tiempoFinal - tiempoInicial;
        System.out.println("Tiempo de ejecución en nanosegundos:" + tiempoEjecución);
        System.out.println("Tiempo de ejecución en milisegundos:" + tiempoEjecución/100000);
        return suma;
    }
   public static void main (String[]args) {
        Algoritmo1 Resultado =  new Algoritmo1();
       System.out.println("La suma es:" + Resultado.Sumar(2000000000));
   }
}
