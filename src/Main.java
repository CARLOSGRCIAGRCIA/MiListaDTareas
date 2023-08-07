import tarea.*;

public class Main {
    public static void main(String[] args) {
        Tutoria tutoria = new Tutoria("clase1");
        Formacion formacion = new Formacion("resolver quiz");
        Soporte soporte = new Soporte("Atender cliente");
        Evaluacion evaluacion = new Evaluacion("Atender entrevista");

        System.out.println(tutoria.toString());
        System.out.println(formacion.toString());
        System.out.println(soporte.toString());
        System.out.println(evaluacion.toString());

        tutoria.setEstado("en curso");
        System.out.println("\n" + tutoria.toString());

        formacion.setEstado("en curso");
        System.out.println(formacion.toString());

        tutoria.setEstado("finalizada");
        System.out.println("\n" + tutoria.toString());

        formacion.setEstado("finalizada");
        System.out.println(formacion.toString());

        soporte.setEstado("en curso");
        System.out.println("\n" + soporte.toString());

        formacion.setEstado("finalizada");
        System.out.println(formacion.toString());

        evaluacion.setEstado("en curso");
        System.out.println("\n" + evaluacion.toString());

        evaluacion.setEstado("finalizada");
        System.out.println(evaluacion.toString());
    }
}
