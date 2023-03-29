
package eddclase202306;


public class Informatico extends Empleado{
    String especialidadTipo;
    String tipoTrabajo;

    public Informatico(String especialidadTipo, String tipoTrabajo, String nombre, String apellidos, String areaEmpresa, int nroCarnet, int pagoHora, int cantHoras, int cantAnios) {
        super(nombre, apellidos, areaEmpresa, nroCarnet, pagoHora, cantHoras, cantAnios);
        this.especialidadTipo = especialidadTipo;
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getEspecialidadTipo() {
        return especialidadTipo;
    }

    public void setEspecialidadTipo(String especialidadTipo) {
        this.especialidadTipo = especialidadTipo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    
    
    public void calcularSueldo(){
        double sueldo = (pagoHora*cantHoras)+antiguedad()+montoEspecialidad();
        System.out.println("EL sueldo del informatico es: "
                +sueldo);
    }
    
    public int montoEspecialidad(){
        int monto = 0;
        if(especialidadTipo=="developer"){
            monto = 700;
        }else if(especialidadTipo=="calidad"){
            monto = 400;
        }else if(especialidadTipo=="manager"){
            monto = 1000;
        }
        
        return monto;
    }
    
    
}
