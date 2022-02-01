
package guia7.ejercicio6;

import java.util.Locale;
import java.util.Scanner;


public class Cafetera {
    
    public int capacidadMaxima;
    public int cantidadActual;
    
    public Cafetera(){
    }
    
    public Cafetera(int capacidadMaxima,int capacidadActual ){
        this.capacidadMaxima= capacidadMaxima;
        this.cantidadActual= capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return cantidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.cantidadActual = capacidadActual;
    }
    
    public void llenarCafetera(int capacidad) {
        capacidadMaxima = capacidad;
        cantidadActual = capacidadMaxima;
        System.out.printf("La capacidad actual de la cafetera es %d\n", cantidadActual);
    }
    
    public void servirTaza(int taza) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    while (taza > capacidadMaxima){
            System.out.printf("Solo puede llenar una taza de capacidad menor a %d\n", capacidadMaxima);
            taza= entrada.nextInt();
        }

    if (cantidadActual>taza){
        cantidadActual-=taza;
        System.out.printf("Se lleno la taza %d y quedo en la cafetera %d\n", taza, cantidadActual);
    } else if (cantidadActual < taza){
        cantidadActual-=taza;
        taza= taza+cantidadActual;
        System.out.printf("Se lleno la taza hasta %d\n y quedo vacia la cafetera", taza);
    } else{
        System.out.printf("Se lleno la taza %d\n y quedo vacia la cafetera", taza);
    }
    
    
}
    
    public void agregarCafe(int cafe) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        while ((cafe + cantidadActual)>capacidadMaxima){
            System.out.printf("Solo puede llenar con cafe hasta %d y la cafetera ya contiene %d \n", capacidadMaxima, cantidadActual);
            cafe= entrada.nextInt();
        }
        
        if ((cafe + cantidadActual)<=capacidadMaxima){
                cantidadActual+=cafe;
                System.out.printf("Se lleno la cafetera, ahora contiene %d\n", cantidadActual);
            } 
        }
    
    
    public void vaciarCafetera() {
        cantidadActual= 0;
        System.out.println("La cantidad actual de cafe es 0");
    }
}
