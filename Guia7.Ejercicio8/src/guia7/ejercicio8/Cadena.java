
package guia7.ejercicio8;


public class Cadena {
    
    
    private String frase;
    private int longitud;
    

    public Cadena() {
    }

    
    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void contarVocales() {
        
        String letra;
        int cantVocales=0;
        
        for (int i = 0; i < longitud; i++) {
            
        letra = frase.toUpperCase().substring(i, i+1);
            
          switch (letra){
                case "A":
                cantVocales++;
                break;
                case "E":
                cantVocales++;
                break;
                case "I":
                cantVocales++;
                break;
                case "O":
                cantVocales++;
                break;
                case "U":
                cantVocales++;
                break;
                default:
                break;
                    
            }  
            
        }
        System.out.printf("La cantidad de vocales encontrada en la frase es: %s\n", cantVocales);
    }
    
    public void invertirFrase() {
        
        String fraseInvertida = "";
        
        for (int i = longitud-1; i >=0 ; i--) {
            fraseInvertida = fraseInvertida.concat(frase.substring(i, i+1));
        }
        System.out.printf("La 1ra frase ingresa es: %s\n", frase);
        System.out.printf("La frase invertida es: %s\n", fraseInvertida);
    }   
    
    public void vecesRepetido(String letra) {
        
        int cont=0;
        
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        
        System.out.printf("La letra %s se encuentra %d\n en la frase", letra, cont);
    }
    
    public void compararFrases(String frase2) {
        
        if (frase.length()> frase2.length()){
            System.out.println("La 1ra frase ingresada es más larga que la 2da frase");
        }else{
            System.out.println("La 2da frase ingresada es más larga que la 1ra frase");
        }
    }
    
    public void unirFrases(String frase2) {
        
        System.out.println(frase.concat(frase2));
        
    }
    
    public void reemplazar(String letra) {
        
        
    frase = frase.replace("a", letra);
    
        System.out.printf("La frase queda asi %s\n: ", frase);

    }
    
    
    public boolean contiene(String letra) {
        
       return frase.contains(letra);
           
       }
       
    
}
