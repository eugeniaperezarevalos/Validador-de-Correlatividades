package domain;

import java.util.List;

public class Inscripcion {
  private List<Materia> materias;
  private Alumno alumno;

  public Inscripcion(Alumno alumno, List<Materia> materias) {
    this.alumno = alumno;
    this.materias = materias;
  }

  public boolean aprobada() {
    for (Materia materia : materias) {
      if (!alumno.cumpleCorrelativas(materia)) {
        return false;
      }
    }
    return true;
  }
}