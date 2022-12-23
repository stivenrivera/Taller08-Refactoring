/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author USER
 */
public class Notas {
    public Estudiante e;
        //duplicate code >> 
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaTeorico(double nexamen,double ndeberes, double nlecciones){
        return (nexamen+ndeberes+nlecciones)*0.80;
    }
    public double CalcularNotaPractico(double ntalleres){
        return (ntalleres)*0.20;
    }
    
    public double CalcularNota(Paralelo p, Calificaciones c){
        double nota=0;
        for(Paralelo par:e.paralelos){
            if(p.equals(par)){
                nota=CalcularNotaTeorico(c.nexamen,c.ndeberes, c.nlecciones)+CalcularNotaPractico(c.ntalleres); 
            }
        }
        return nota;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaInicial(Paralelo p, Calificaciones c){
        return CalcularNota(p, c);
    }
    
    public double CalcularNotaFinal(Paralelo p, Calificaciones c){
        return CalcularNota(p, c);
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:e.paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
