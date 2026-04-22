package org.example.interfaces;

import org.example.modelos.Producto;

import java.util.List;

public interface ProductoInterface {

    public void agregarProducto(String nombre, int cantidad, double precio);

    public List<Producto> getroductos();

}
