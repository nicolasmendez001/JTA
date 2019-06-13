package co.edu.uptc.sw2.transaccion.persistencia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
    
    @Id
    private int id;
    private String name;
    private String numeroDocumento;
    @OneToOne
    private Tarjeta tarjeta;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
