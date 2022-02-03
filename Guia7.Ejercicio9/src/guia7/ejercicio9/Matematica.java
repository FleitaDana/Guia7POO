
package guia7.ejercicio9;


public class Matematica {
    
    private double nro1;
    private double nro2;

    public Matematica() {
    }

    public Matematica(double nro2) {
        this.nro2 = nro2;
    }

    public double getNro1() {
        return nro1;
    }

    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }

    public double getNro2() {
        return nro2;
    }

    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }
    
    public double mayorValor() {
        
        return Math.max(nro1, nro2);
        
    }
    
    public void calcularPotencia() {
        
       double a = Math.round(mayorValor()) ;
       double b = Math.round(Math.min(nro1, nro2));
       
        System.out.printf("La potencia es %f\n",Math.pow(a, b));
    }
    
    public void calcularRaiz() {
        
       double a = Math.abs(nro1);
       double b = Math.abs(nro2);
       
        System.out.printf("La raiz cuadrada del menor numero es %f\n", Math.sqrt(Math.min(a, b)));
       
    }
}
