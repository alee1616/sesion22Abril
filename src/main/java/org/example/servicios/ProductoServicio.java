package org.example.servicios;

import org.example.interfaces.ProductoInterface;
import org.example.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio implements ProductoInterface {

    private final List<Producto> productos;

    public ProductoServicio() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String nombre, double precio, int cantidad) {
        this.productos.add(new Producto(nombre, cantidad, precio));
    }

    @Override
    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
    }

    @Override
    public void modificarProducto(String nombreOriginal, String nuevoNombre, double nuevoPrecio, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreOriginal)) {
                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                producto.setCantidad(nuevaCantidad);
                break;
            }
        }
    }

    @Override
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Calcula el monto total a pagar por todos los productos en la lista.
     * @return monto total
     */
    public double getMonto() {
        double monto = 0;
        for (Producto producto : productos) {
            double total = producto.getCantidad() * producto.getPrecio();
            monto += total;
        }
        return monto;
    }

    @Override
    public void agregarProducto(String nombre, int cantidad, double precio) {

    }

    @Override
    public List<Producto> getroductos() {
        return List.of();
    }
}
