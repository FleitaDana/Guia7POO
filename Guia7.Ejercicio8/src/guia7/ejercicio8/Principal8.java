
package guia7.ejercicio8;

import java.util.Locale;
import java.util.Scanner;


public class Principal8 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        Cadena cadena = new Cadena();
        String frase;
        int opcion;
        String letra;
        boolean salir=false;
        String frase2;
       
        
        System.out.println("Ingrese una frase");
        frase = entrada.next();
        cadena.setFrase(frase);
        
        cadena.setLongitud(frase.length());
        
        do {
        System.out.println("MENU");
        System.out.println("1. VER CANTIDAD DE VOCALES");
        System.out.println("2. INVERTIR FRASE");
        System.out.println("3. VER CUANTAS VECES SE ENCUENTRA UNA LETRA EN LA FRASE");
        System.out.println("4. COMPARAR LONGITUD CON UNA NUEVA FRASE INGRESADA");
        System.out.println("5. UNIR DOS FRASES");
        System.out.println("6. REEMPLAZAR LETRA A DE LA FRASE POR OTRO CARACTER");
        System.out.println("7. VER SI LA FRSE CONTIENE UNA LETRA EN ESPECIAL");
        System.out.println("8. SALIR");
        
        opcion= entrada.nextInt();
        
        switch (opcion){
            case 1:
                cadena.contarVocales();
            break;
            case 2:
                cadena.invertirFrase();
            break;
            case 3:
                System.out.println("Ingrese una letra a buscar en la frase");
                letra = entrada.next();
                cadena.vecesRepetido(letra);
            break;
            case 4:
                System.out.println("Ingrese frase para comparar");
                frase2 = entrada.next();
                cadena.compararFrases(frase2);
            break;
            case 5:
                System.out.println("Ingrese frase para unir");
                frase2 = entrada.next();
                cadena.unirFrases(frase2);
            break;
            case 6:
                System.out.println("Ingrese un simbolo para reemplazar las letras a de la frase");
                letra = entrada.next();
                cadena.reemplazar(letra );
            break;
            case 7:
                System.out.println("Ingrese una letra a buscar en la frase");
                letra = entrada.next();
                cadena.contiene(letra);
                boolean encontrado = cadena.contiene(letra);
                if (encontrado){
                    System.out.println("La letra fue encontrada en la frase");
                } else{
                    System.out.println("No se encontro la letra en la frase");
                }
                
            break;
            case 8:
                System.out.println("Desea salir S/N");
                String decision = entrada.next();
                while (decision.equalsIgnoreCase("S") && decision.equalsIgnoreCase("N")){
                    System.out.println("Desea salir S/N");
                    decision = entrada.next();
                    if (decision.equals("S")){
                    salir = true;
                }
                }
 
            break;
            default:
                System.out.println("Ingrese una opcion valida");
            break;
            
        }
        
        }while (salir = true);
    }
}
    

