
package guia7.ejercicio7;

import java.util.Locale;
import java.util.Scanner;


public class Persona {
    
     private String nombre;
     private int edad;
     private String sexo;
     private int peso;
     private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
    public void crearPersona() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese nombre");
        nombre = entrada.next();
        System.out.println("Ingrese edad");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese peso");
        peso = entrada.nextInt();
        System.out.println("Ingrese altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese sexo (M, H, O)");
        sexo = entrada.next();
          
        } 
    
    public int calcularImc() {
        
        double imc = peso / (Math.pow(altura, 2));
            
        if (imc < 20){
            return -1;
        } else if (imc > 20 && imc < 25){
            return 0;
        } else {
            return 1 ;
        }  
    }
    
    public boolean esMayorDeEdad() {
        
        return edad >= 18;
    }
}

