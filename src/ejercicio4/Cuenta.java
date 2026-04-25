package ejercicio4;

public class Cuenta {

    public double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }
}