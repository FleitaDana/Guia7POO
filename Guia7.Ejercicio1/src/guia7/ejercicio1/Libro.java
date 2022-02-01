
package guia7.ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Libro {
    
    int ISBN;
    String titulo;
    String autor;
    int nroPag;
    
    public Libro(){
}
    
    public Libro(int ISBN, String titulo, String autor, int nroPag){
    }
    
    public void cargarLibro(){
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese ISBN del libro: ");
        ISBN = entrada.nextInt();
        System.out.println("Ingrese titulo del libro: ");
        titulo = entrada.next();
        System.out.println("Ingrese autor del libro: ");
        autor = entrada.next();
        System.out.println("Ingrese nroPag del libro: ");
        nroPag = entrada.nextInt();
    }
    
    public void mostrar(){
        System.out.println("Ingrese ISBN del libro: " + ISBN);
        System.out.println("Ingrese titulo del libro: " + titulo);
        System.out.println("Ingrese autor del libro: " + autor);
        System.out.println("Ingrese nroPag del libro: " + nroPag);
    }
    
    
}
