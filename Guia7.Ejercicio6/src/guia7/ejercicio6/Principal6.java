
package guia7.ejercicio6;

import java.util.Locale;
import java.util.Scanner;


public class Principal6 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cafetera cafetera = new Cafetera();
      
        boolean salir = true;
        int opcion;
        int capacidad;
        int taza;
        int cafe;
        
        do {
        System.out.println("MENU");
        System.out.println("1. LLENAR CAFETERA");
        System.out.println("2. SERVIR TAZA");
        System.out.println("3. AGREGAR CAFE");
        System.out.println("4. VACIAR CAFETERA");
        opcion= entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese cantidad maxima que puede contener la cafetera");
                capacidad = entrada.nextInt();
                cafetera.llenarCafetera(capacidad);
            break;
            case 2:
                System.out.println("Ingrese tamaño de la taza");
                taza = entrada.nextInt();
                cafetera.servirTaza(taza);
            break;
            case 3:
                System.out.println("Ingrese cantidad de cafe para ingresar en la cafetera");
                cafe = entrada.nextInt();
                cafetera.agregarCafe(cafe);
            break;
            case 4:
                cafetera.vaciarCafetera();
            break;
        }
        }while (salir = true);
    }
    
}
