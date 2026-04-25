package ejercicio10;

public class TrabajadorPorHora extends Trabajador {

    double horas;
    double pagoHora;

    public TrabajadorPorHora(double horas, double pagoHora) {
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

	@Override
    public double calcularPago() {
        return horas * pagoHora;
    }
}