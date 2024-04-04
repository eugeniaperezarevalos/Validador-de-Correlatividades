package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
  private String nombre;
  private String legajo;
  private List<Materia> materiasAp;

  public Alumno() {
    this.materiasAp = new ArrayList<>();
  }

  public void agregarMateriaAprobada(Materia materia) {
    materiasAp.add(materia);
  }

  public boolean cumpleCorrelativas(Materia materia) {
    if (!materia.tieneCorrelativas()) {
      return true;
    }
    for (Materia correlativa : materia.getCorrelativas()) {
      if (!materiasAp.contains(correlativa)) {
        return false;
      }
    }
    return true;
  }
}