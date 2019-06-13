package co.edu.uptc.sw2.transaccion.servicios.logica.exepctions;

import javax.ws.rs.WebApplicationException;

@javax.ejb.ApplicationException(rollback = true)
public class ManejoExcepciones extends WebApplicationException{
    
    public ManejoExcepciones(String mensaje) {
        super(mensaje, 500);
    }
    
}
