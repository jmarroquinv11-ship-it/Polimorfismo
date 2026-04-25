# 📦 Proyecto de Polimorfismo en Java

## 📁 Código fuente completo

El proyecto contiene 10 ejercicios donde se aplican conceptos de **herencia y polimorfismo** en Java.
Cada ejercicio está organizado en paquetes (`ejercicio1` hasta `ejercicio10`) y contiene:

* Una clase base (padre)
* Una clase derivada (hija)
* Métodos sobrescritos para demostrar polimorfismo

Además, incluye una clase `Main` que ejecuta todos los ejemplos.

---

## ▶️ Ejecución con ejemplos (Main)

El programa principal ejecuta pruebas de cada ejercicio, por ejemplo:

```java
Animal a = new Perro();
a.hacerSonido();

Figura f = new Rectangulo(5, 3);
System.out.println("Área: " + f.area());

Empleado e = new Vendedor("Juan", 200);
e.resumen();
```

Esto demuestra cómo un objeto hijo puede ser tratado como su clase padre.

---

## 🧬 Aplicación de Herencia

La herencia se aplicó creando clases generales (padre) que comparten atributos y comportamientos comunes, y luego clases específicas (hijas) que extienden esas funcionalidades.

Ejemplos:

* Perro hereda de Animal
* Rectangulo hereda de Figura
* Vendedor hereda de Empleado
* CuentaAhorro hereda de Cuenta
* Avion hereda de Transporte
* Estudiante hereda de Persona
* Motocicleta hereda de Vehiculo
* ProductoDigital hereda de Producto
* Guitarra hereda de Instrumento
* TrabajadorPorHora hereda de Trabajador

Esto permite reutilizar código y organizar mejor la lógica del programa.

---

## 🔁 Métodos Sobrescritos (Override)

En cada clase hija se sobrescriben métodos de la clase padre para cambiar su comportamiento.

Ejemplos:

* hacerSonido() en Perro
* area() en Rectangulo
* resumen() en Vendedor
* depositar() en CuentaAhorro
* moverse() en Avion
* presentarse() en Estudiante
* encender() en Motocicleta
* mostrarDescripcion() en ProductoDigital
* tocar() en Guitarra
* calcularPago() en TrabajadorPorHora

Esto es lo que permite el polimorfismo, ya que un mismo método se comporta diferente según el objeto.

---

## 🧪 Casos de Prueba Utilizados

Los casos de prueba se ejecutan desde la clase Main, donde:

* Se crean objetos de clases hijas usando referencias de tipo padre
* Se llaman métodos sobrescritos
* Se imprimen resultados en consola

Ejemplos:

* Crear un Animal como Perro y ejecutar sonido
* Calcular el área de un rectángulo
* Simular depósito en cuenta de ahorro
* Calcular pago de trabajador por hora

Estos casos validan que el polimorfismo funciona correctamente.

---

## 📝 Notas

* La explicación también se encuentra en comentarios dentro del código fuente
* El proyecto fue desarrollado en Eclipse
* Incluye carpeta src, bin y configuración del proyecto
