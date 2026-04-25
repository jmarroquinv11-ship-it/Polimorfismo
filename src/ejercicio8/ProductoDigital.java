package ejercicio8;

public class ProductoDigital extends Producto {

    public ProductoDigital(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Producto digital: " + nombre + " Precio: " + precio);
    }
}