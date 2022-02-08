
package guia7.ejercicio10;

import java.util.Arrays;


public class Principal10 {

    
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random()*51);
            
        }
        
        System.out.println("Arreglo A");
        Arrays.sort(arregloA);
        System.out.println(Arrays.toString(arregloA));
        
        double[] arregloB = Arrays.copyOfRange(arregloA, 0, 20);
        
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        System.out.println(Arrays.toString(arregloA));
        System.out.println(Arrays.toString(arregloB));
    }
    
}
