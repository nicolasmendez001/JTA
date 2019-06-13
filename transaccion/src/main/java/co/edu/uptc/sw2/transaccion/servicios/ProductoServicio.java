
package co.edu.uptc.sw2.transaccion.servicios;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Producto;
import co.edu.uptc.sw2.transaccion.servicios.logica.ProductoLogica;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("Producto")
public class ProductoServicio {
    
    @EJB
    private ProductoLogica cl;
    
    @GET
    public List<Producto> getListCliente(){
        return cl.getListProducto();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<String> saveProduct(Producto producto){
        List l = new ArrayList();
        l.add(cl.saveProduct(producto));
        return l;
    }
}