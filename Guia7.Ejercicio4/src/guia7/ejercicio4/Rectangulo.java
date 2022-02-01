package guia7.ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
    }

    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese base:");
        base = entrada.nextInt();
        System.out.println("Ingrese base:");
        altura = entrada.nextInt();
    }
    
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es: " +  (base+altura) *2);
    }
    
    public void superficie(){
        System.out.println("La superficie del rectangulo es: "+ base*altura);
    }
    
    public void dibujarRectacgulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
