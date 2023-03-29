
package eddclase202306;


public class Contador extends Empleado{
    String matricula;
    int pagoHoraExtra;
    int cantHorasExtra;

    public Contador(String matricula, int pagoHoraExtra, int cantHorasExtra, String nombre, String apellidos, String areaEmpresa, int nroCarnet, int pagoHora, int cantHoras, int cantAnios) {
        super(nombre, apellidos, areaEmpresa, nroCarnet, pagoHora, cantHoras, cantAnios);
        this.matricula = matricula;
        this.pagoHoraExtra = pagoHoraExtra;
        this.cantHorasExtra = cantHorasExtra;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(int pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    @Override
    public void calcularSueldo(){
        double sueldo = (pagoHora*cantHoras)+antiguedad()+(cantHorasExtra*pagoHoraExtra);
        System.out.println("El sueldo del contador es: "
                +sueldo);
    }
    
   
    
    
}
