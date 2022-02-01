
package guia7.ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class Circuferencia {
    
    private double radio;
    
    public Circuferencia (double radio){
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircuferencia(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio:");
        radio = entrada.nextInt();
    }
    
    public void area(){
        System.out.printf("El area de la circuferencia es %.2f", Math.PI*Math.pow(radio, 2));
    }
    
    public void perimetro(){
        System.out.printf("El perimetro de la circufencia es %.2f", (2*Math.PI*radio));
    }
}
