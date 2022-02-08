
package guia7.ejercicio11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Principal11 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Date fechaActual = new Date();
        
        System.out.println("Ingrese anio");
        int anio = entrada.nextInt();
        System.out.println("Ingrese mes");
        int mes = entrada.nextInt();
        System.out.println("Ingrese dia");
        int dia = entrada.nextInt();
        
        Date fecha = new Date(dia, mes, anio);
        
        System.out.printf("La fecha ingresada es %d/%d/%d\n", anio,mes,dia);
        System.out.printf("La fecha de hoy es: %d/%d/%d\n", fechaActual.getYear()+1900,fechaActual.getMonth()+1,fechaActual.getDate());
        
        int diferencia = fechaActual.getYear()+1900-anio;
        
        System.out.printf("La diferencia de años es: %d ", diferencia);
    }
    
}
