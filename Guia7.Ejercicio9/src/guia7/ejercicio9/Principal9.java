
package guia7.ejercicio9;


public class Principal9 {

    
    public static void main(String[] args) {
        
        Matematica matematicas = new Matematica();
        
        matematicas.setNro1(Math.random()*11);
        matematicas.setNro2(Math.random()*11);
        
        
        System.out.printf("El numero 1 es %f, el numero 2 es %f\n", matematicas.getNro1(), matematicas.getNro2());
        
        
        matematicas.calcularPotencia();
        matematicas.calcularRaiz();
        
    }
    
}
