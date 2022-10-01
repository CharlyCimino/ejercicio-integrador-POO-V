
package ar.charlycimino.ejercicioV;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Examen implements Aprobable {
    private String fecha;

    public Examen(String fecha) {
        this.fecha = fecha;
    }
    
}
