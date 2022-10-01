
package ar.charlycimino.ejercicioV;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ExamenEscrito extends Examen {
    private static final int MIN_NOTA = 0;
    private static final int MAX_NOTA = 10;
    private static final int NOTA_APROB = 6;
    private static final int MIN_DURACION = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        return nota >= NOTA_APROB && duracion <= MIN_DURACION;
    }
    
    
}
