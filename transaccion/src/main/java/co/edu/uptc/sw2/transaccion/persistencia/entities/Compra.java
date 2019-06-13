package co.edu.uptc.sw2.transaccion.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compra {
    
    @Id
   private int id;
   private Cliente cliente;
   private Producto producto;
   private int numeroUnidades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }
}