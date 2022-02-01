
package guia7.ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Principal5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cuenta bancaria = new Cuenta();
        
        bancaria.añadirDatos();
        
        System.out.println("Ingrese cantidad de dinero que desea ingresar en su cuenta");
        int ingresar= entrada.nextInt();
        bancaria.ingresarDinero(ingresar);
        
        System.out.println("Ingrese cantidad de dinero que desea retirar en su cuenta");
        int retirar= entrada.nextInt();
        bancaria.retirarDinero(retirar);
        
        bancaria.extraccionRapida();
        bancaria.consultarSaldo();
        bancaria.consultarDatos();
        
    }
    
}
