
package eddclase202306;


public class Empleado {
    String nombre,apellidos,areaEmpresa;
    int nroCarnet;
    int pagoHora,cantHoras,cantAnios;

    public Empleado(String nombre, String apellidos, String areaEmpresa, int nroCarnet, int pagoHora, int cantHoras, int cantAnios) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.areaEmpresa = areaEmpresa;
        this.nroCarnet = nroCarnet;
        this.pagoHora = pagoHora;
        this.cantHoras = cantHoras;
        this.cantAnios = cantAnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAreaEmpresa() {
        return areaEmpresa;
    }

    public void setAreaEmpresa(String areaEmpresa) {
        this.areaEmpresa = areaEmpresa;
    }

    public int getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(int nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getCantAnios() {
        return cantAnios;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }
    
    public void calcularSueldo(){
        System.out.println("El sueldo de empleado es: "
                +(cantHoras*pagoHora));
    }
    
    public int antiguedad(){
        int ant = 0;
        if(cantAnios>5&&cantAnios<=10){
            ant = 300;
        }if(cantAnios>10){
            ant = 600;
        }
        return ant;
    }
    
}
