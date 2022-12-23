package modelos;

public class InformacionAdicionalProfesor {
    
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    
    public double calcularSueldo(Profesor prof){
        return prof.info.añosdeTrabajo*600 + prof.info.BonoFijo;
    }  
}
