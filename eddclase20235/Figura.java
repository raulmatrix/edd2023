
package eddclase20235;

public class Figura {
    //atributos
    int x,y;
    String nombre;

    //metodo constructor
    public Figura(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //get and set

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void calcularArea(){
        System.out.println("Este calculo no existe, es una figura generica");
    }
        
    

   
    
            
    
    
    
}
