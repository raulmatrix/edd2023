
package edd2023clase1;

public class EDD2023Clase1 {

    
    public static void main(String[] args) {
        
        //comentario 1
        
        /*bloque
        de 
        comentarios*/
        
        //tipos de datos nativos
        int numero = 15;
        float numero2 = 12.1f;
        double numero3 = 12.5;
        boolean valor = true;
        //--------------------
        
        String nombre = "Raul";
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        
        System.out.println("El primer caracter de nombre es:"
                +nombre.charAt(0));
        
        String nombre1 = "Laura";
        String apellido1 = "Perez";
        
        System.out.println(nombre1 + " "+apellido1);
        
        /************************/
        
        int valor1 = 35;
        int valor2 = 20;
        int valor3 = 22;
        
        if((valor1>valor2)&&(valor1>valor3)){
            System.out.println("Valor 1 es mayor");
          
        }else 
            if((valor2>valor1)&&(valor2>valor3)){
                System.out.println("Valor 2 es mayor");
        
        }    
        else{
            System.out.println("El valor 3 es mayor"); 
        }
    }
    
}
