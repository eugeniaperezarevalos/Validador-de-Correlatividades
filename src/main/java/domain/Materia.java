package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {
  private List<Materia> correlativas;

  public Materia() {
    this.correlativas = new ArrayList<>();
  }

  public boolean tieneCorrelativas() {
    return !correlativas.isEmpty();
  }

  public void agregarCorrelativa(Materia materia) {
    correlativas.add(materia);
  }

  public List<Materia> getCorrelativas() {
    return correlativas;
  }
}