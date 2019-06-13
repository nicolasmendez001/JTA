package co.edu.uptc.sw2.transaccion.servicios.logica.exepctions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<ManejoExcepciones>{

    @Override
    public Response toResponse(ManejoExcepciones exception) {
        String aux = exception.getMessage();
        return Response.status(Response.Status.NOT_FOUND).entity(aux).build();
    }
}
