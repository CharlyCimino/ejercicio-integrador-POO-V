
package ar.charlycimino.ejercicioV;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();
        
        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno maria = new Alumno("124", "Mengano", "Maria");
        Alumno luis = new Alumno("125", "Sultano", "Luis");
        
        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));
        
        maria.agregarExamen(new ExamenEscrito(60, 4, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        luis.agregarExamen(new ExamenEscrito(100, 9, "00/00/0000"));       
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);
        
        System.out.println("Cantidad de aprobados: " + c.cantAprobados());
    }

}
