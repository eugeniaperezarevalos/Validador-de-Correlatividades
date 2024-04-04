package domain;

import java.util.Arrays;

public class TestInscripcion {

  public static void main(String[] args) {

    //MATERIAS
    Materia algoritmos = new Materia();
    Materia paradigmas = new Materia();
    paradigmas.agregarCorrelativa(algoritmos);
    Materia diseñoSistemas = new Materia();
    diseñoSistemas.agregarCorrelativa(paradigmas);

    //ALUMNO
    Alumno alumno = new Alumno();
    alumno.agregarMateriaAprobada(algoritmos);
    alumno.agregarMateriaAprobada(paradigmas);


    // TESTS!!!
    Inscripcion inscripcion1 = new Inscripcion(alumno, Arrays.asList(diseñoSistemas));
    System.out.println("Inscripción 1: " + inscripcion1.aprobada());

    Inscripcion inscripcion2 = new Inscripcion(alumno, Arrays.asList(paradigmas));
    System.out.println("Inscripción 2: " + inscripcion2.aprobada());
  }

}
