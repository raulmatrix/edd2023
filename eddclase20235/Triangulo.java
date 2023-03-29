
package eddclase20235;


public class Triangulo extends Figura{
    int base,altura;

    public Triangulo(int base, int altura, int x, int y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del trinagulo es: "
                +((base*altura)/2));
    }
    
    
}
