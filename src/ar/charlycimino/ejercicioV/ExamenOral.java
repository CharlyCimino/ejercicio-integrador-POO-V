
package ar.charlycimino.ejercicioV;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ExamenOral extends Examen {
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelSatisfaccion nivelSatisfaccion, String fecha) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }
    
    @Override
    public boolean aprobo() {
        return nivelSatisfaccion.ordinal() >= NivelSatisfaccion.SUFICIENTE.ordinal();
    }
    
}
