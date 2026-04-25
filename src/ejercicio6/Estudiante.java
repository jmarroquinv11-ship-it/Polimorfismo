package ejercicio6;

public class Estudiante extends Persona {

    String carnet, carrera;

    public Estudiante(String carnet, String carrera) {
        this.carnet = carnet;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy estudiante, carnet: " + carnet + " carrera: " + carrera);
    }
}