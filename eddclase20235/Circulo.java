
package eddclase20235;


public class Circulo extends Figura{
    int radio;
    double pi=3.1416;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    @Override
   public void calcularArea(){
        System.out.println("El area del circulo es: "
                +(pi*(radio*radio)));
   }
    
    
    
    
}
