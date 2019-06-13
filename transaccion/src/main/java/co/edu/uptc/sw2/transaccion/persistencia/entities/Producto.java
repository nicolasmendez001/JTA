package co.edu.uptc.sw2.transaccion.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Producto {
    
    @Id
    private int id;
    private String nombre;
    private long valor;
    private String img;
    private int unidadDisponible;

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidadDisponible() {
        return unidadDisponible;
    }

    public long getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadDisponible(int unidadDisponible) {
        this.unidadDisponible = unidadDisponible;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }
}
