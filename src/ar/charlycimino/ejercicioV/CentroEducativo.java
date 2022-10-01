
package ar.charlycimino.ejercicioV;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CentroEducativo {
    private ArrayList<Alumno> alumnos;
    
    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno a) {
        this.alumnos.add(a);
    }
    
    public int cantAprobados() {
        int cant = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.aprobo()) {
                cant++;
            }
        }
        return cant;
    }
}
