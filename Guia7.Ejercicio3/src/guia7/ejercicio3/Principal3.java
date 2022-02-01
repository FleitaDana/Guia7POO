
package guia7.ejercicio3;


public class Principal3 {

    
    public static void main(String[] args) {
        
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();

       System.out.printf("El resultado de la suma entre %.2f + %.2f es %.1f \n", operacion.getNum1(),operacion.getNum2(),operacion.sumar());
       System.out.printf("El resultado de la resta entre %.2f - %.2f es %.1f \n", operacion.getNum1(),operacion.getNum2(),operacion.restar());
       System.out.printf("El resultado de la multiplicacion entre %.2f * %.1f es %.1f \n", operacion.getNum1(),operacion.getNum2(),operacion.multiplicar());
       System.out.printf("El resultado de la division entre %.2f + %.2f es %.1f \n", operacion.getNum1(),operacion.getNum2(),operacion.dividir());
    }
    
}
