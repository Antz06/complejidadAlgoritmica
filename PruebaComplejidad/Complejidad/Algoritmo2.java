package Complejidad;

public class Algoritmo2 {
    /* Algoritmo 2. Se utiliza la formula (n * (n + 1))/2 para realizar la suma */
    public double Suma (double n) {
        double tiempoInicial = System.nanoTime();
        double suma = (n*(n+1))/2;
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
