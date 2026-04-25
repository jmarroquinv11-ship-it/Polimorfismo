package main;

import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;
import ejercicio5.*;
import ejercicio6.*;
import ejercicio7.*;
import ejercicio8.*;
import ejercicio9.*;
import ejercicio10.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("----- EJERCICIO 1 -----");
        Animal a = new Perro();
        a.hacerSonido();

        System.out.println("----- EJERCICIO 2 -----");
        Figura f = new Rectangulo(5, 3);
        System.out.println("Área: " + f.area());

        System.out.println("----- EJERCICIO 3 -----");
        Empleado e = new Vendedor("Juan", 200);
        e.resumen();

        System.out.println("----- EJERCICIO 4 -----");
        Cuenta c = new CuentaAhorro(100);
        c.depositar(50);
        System.out.println("Saldo: " + c.saldo);

        System.out.println("----- EJERCICIO 5 -----");
        Transporte t = new Avion();
        t.moverse();

        System.out.println("----- EJERCICIO 6 -----");
        Persona p = new Estudiante("123", "Ingeniería");
        p.presentarse();

        System.out.println("----- EJERCICIO 7 -----");
        Vehiculo v = new Motocicleta();
        v.encender();

        System.out.println("----- EJERCICIO 8 -----");
        Producto pr = new ProductoDigital("Curso", 50);
        pr.mostrarDescripcion();

        System.out.println("----- EJERCICIO 9 -----");
        Instrumento i = new Guitarra();
        i.tocar();

        System.out.println("----- EJERCICIO 10 -----");
        TrabajadorPorHora tr = new TrabajadorPorHora(8, 10);
        System.out.println("Pago: " + tr.calcularPago());
    }
}