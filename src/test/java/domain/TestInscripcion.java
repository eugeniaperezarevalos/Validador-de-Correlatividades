package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestInscripcion {

  @Test
  public void testInscripcionRechazada() {
    Materia algoritmos = new Materia();
    Materia paradigmas = new Materia();
    paradigmas.agregarCorrelativa(algoritmos);
    Materia diseñoSistemas = new Materia();
    diseñoSistemas.agregarCorrelativa(paradigmas);

    Alumno alumno = new Alumno();
    alumno.agregarMateriaAprobada(algoritmos);

    Inscripcion inscripcionRechazada = new Inscripcion(alumno, Arrays.asList(paradigmas, diseñoSistemas));

    if (inscripcionRechazada.aprobada()) {
      System.out.println("La inscripción fue aprobada");
    } else {
      System.out.println("La inscripción fue rechazada");
    }

    Assert.assertFalse("La inscripción debería ser rechazada", inscripcionRechazada.aprobada());
  }

  @Test
  public void testInscripcionAprobada() {
    Materia algoritmos = new Materia();
    Materia paradigmas = new Materia();
    paradigmas.agregarCorrelativa(algoritmos);
    Materia diseñoSistemas = new Materia();
    diseñoSistemas.agregarCorrelativa(paradigmas);

    Alumno alumno = new Alumno();
    alumno.agregarMateriaAprobada(algoritmos);
    alumno.agregarMateriaAprobada(paradigmas);
    alumno.agregarMateriaAprobada(diseñoSistemas);

    Inscripcion inscripcionAprobada = new Inscripcion(alumno, Arrays.asList(diseñoSistemas));

    if (inscripcionAprobada.aprobada()) {
      System.out.println("La inscripción fue aprobada");
    } else {
      System.out.println("La inscripción fue rechazada");
    }

    Assert.assertTrue("La inscripción debería ser aprobada", inscripcionAprobada.aprobada());
  }
}
