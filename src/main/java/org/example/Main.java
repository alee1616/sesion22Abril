package org.example;

import org.example.modelos.Producto;
import org.example.servicios.ProductoServicio;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ProductoServicio productos= new ProductoServicio();

         productos.agregarProducto("cafe", 3,40);
         productos.agregarProducto("Tajadas con queso",3,60);

        System.out.println("Factura");
        System.out.println(productos.getroductos());
        System.out.println("Total a pagar" + productos.getMonto());


    }
}