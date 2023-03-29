
package eddclase20235;

public class EDDClase20235 {

  
    public static void main(String[] args) {
       
        
        Figura rectangulo = new Figura(5, 10, "Rectangulo");
        Figura circulo = new Figura(15,20);
         
        System.out.println("La posicion de circulo en X es: "
                +circulo.getX());
        circulo.setX(35);
        
        System.out.println("La posicion de circulo en X es: "
                +circulo.getX());
        
        
        Circulo circulo1 = new Circulo(5, 6, 6);
        Triangulo triangulo1 = new Triangulo(10, 20, 7, 7);
        
        circulo1.calcularArea();
        triangulo1.calcularArea();
    }
    
}
