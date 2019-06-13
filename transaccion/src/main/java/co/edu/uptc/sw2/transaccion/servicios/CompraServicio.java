package co.edu.uptc.sw2.transaccion.servicios;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Compra;
import co.edu.uptc.sw2.transaccion.servicios.logica.CompraLogica;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("Compra")
public class CompraServicio {

    @EJB
    private CompraLogica cl;

    @POST
    @Path("saveCompra")
    public List<String> saveCompra(Compra compra) {
        List<String> list = new ArrayList<>();
        list.add(cl.saveCompra(compra));
        return list;
    }
}
