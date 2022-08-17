package com.ejercicioTemaDos.servicio;

import com.ejercicioTemaDos.modelo.Cliente;
import com.ejercicioTemaDos.modelo.Producto;

public class MostrarPrecio {

    public void execute(){
        Cliente cliente = new Cliente("Sara");

        Producto telefono = new Producto("telefono", 50);

        double precioAPagar = cliente.pagarProducto(telefono);
        System.out.println("Monto a cancelar con IVA: " + precioAPagar);
    }
}
