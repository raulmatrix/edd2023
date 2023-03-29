
package eddclase202306;


public class EDDClase202306 {

    
    public static void main(String[] args) {
       Empleado e1 = new Empleado("Jose", "Rojas", "Generico", 4568957, 50, 160, 2);
       e1.calcularSueldo();
       
       Contador c1 = new Contador("CON-001", 80, 20, "Adolfo", "Perez", "Contabilidad", 5689657, 70, 170, 7);
       c1.calcularSueldo();
    }
    
}
