package co.edu.uptc.sw2.transaccion.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarjeta {

    @Id
    private int id;
    private double monto;
    private String numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
