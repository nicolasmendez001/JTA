package co.edu.uptc.sw2.transaccion.servicios.logica;

import co.edu.uptc.sw2.transaccion.persistencia.ProductoDao;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Producto;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ProductoLogica {

    @EJB
    private ProductoDao dao;
    
    public List<Producto> getListProducto(){
        return dao.getProducto();
    }

    public String saveProduct(Producto producto) {
        return dao.saveProduct(producto);
    }
}
