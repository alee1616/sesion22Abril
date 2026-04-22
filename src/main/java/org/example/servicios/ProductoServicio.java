package org.example.servicios;

import org.example.interfaces.ProductoInterface;
import org.example.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio implements ProductoInterface {

    private List<Producto> productos;

    public ProductoServicio() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String nombre, int cantidad, double precio) {
        this.productos.add(new Producto(nombre, cantidad, precio));

    }

    @Override
    public List<Producto> getroductos() {
        return productos;
    }

    public double getMonto(){
        double total = 0, monto = 0;
        for(Producto producto : productos){
            total = producto.getCantidad() * producto.getPrecio();
            monto += total;
        }

        return monto;

    }
}
