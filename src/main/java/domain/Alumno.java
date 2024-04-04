package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
  private List<Materia> materiasAprobadas;

  public Alumno() {
    this.materiasAprobadas = new ArrayList<>();
  }

  public void agregarMateriaAprobada(Materia materia) {
    materiasAprobadas.add(materia);
  }

  public boolean cumpleCorrelativas(Materia materia) {
    if (!materia.tieneCorrelativas()) {
      return true;
    }
    for (Materia correlativa : materia.getCorrelativas()) {
      if (!materiasAprobadas.contains(correlativa)) {
        return false;
      }
    }
    return true;
  }
}