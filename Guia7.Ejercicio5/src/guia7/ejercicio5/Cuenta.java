
package guia7.ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    
    public Cuenta(){ 
    }
    
    public Cuenta(int numeroCuenta,int DNI,int saldoActual){ 
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void añadirDatos(){
        System.out.println("Ingrese numero de cuenta: ");
        numeroCuenta = entrada.nextInt();
        System.out.println("Ingrese DNI: ");
        DNI = entrada.nextInt();
        System.out.println("Ingrese el saldo actual: ");
        saldoActual = entrada.nextInt();
    }
    
    public void ingresarDinero(int ingresar){
        saldoActual += ingresar;
        System.out.printf("Ingresó %d y su saldo actual es %d \n", ingresar, saldoActual);
    }
    
    public void retirarDinero(int retirar){
        if (retirar >= saldoActual){
            saldoActual= 0;
            System.out.printf("Retiró %d y su saldo actual es 0 \n ", retirar);
        } else{
            saldoActual-= retirar;
            System.out.printf("Retiró %d y su saldo actual es %d \n", retirar, saldoActual);
        }
    }
    
    
    public void extraccionRapida(){
        System.out.println("Ingrese cantidad de dinero que desea retirar en extraccion rapida");
        int extraccion = entrada.nextInt();
        do {
            System.out.println("Solo puede retirar el 20% de su saldo que es: \n" +  saldoActual*0.2); 
            System.out.println("Ingrese cantidad de dinero que desea retirar en extraccion rapida");
            extraccion = entrada.nextInt();
        }while (extraccion>saldoActual*0.2 || extraccion<saldoActual*0.2);
        saldoActual-= extraccion;
        System.out.printf("Realizo la extraccion rapida de %d y Su saldo actual es %d \n",extraccion, saldoActual);  
        }      
    
           
    public void consultarSaldo(){
        System.out.println("*****************");
        System.out.printf("Su saldo actual es %d \n", saldoActual);
    }
    
    public void consultarDatos(){
        System.out.printf("Su numero de cuenta es %d \n", numeroCuenta);
        System.out.printf("Su DNI es %d \n", DNI);
        System.out.println("*****************");
    }
    
}
