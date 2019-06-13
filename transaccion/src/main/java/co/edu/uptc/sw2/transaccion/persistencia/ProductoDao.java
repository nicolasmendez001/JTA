package co.edu.uptc.sw2.transaccion.persistencia;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductoDao {

   @PersistenceContext
    private EntityManager em;

    public List<Producto> getProducto() {
        String query = "Select p from Producto p";
        return em.createQuery(query).getResultList();
    }

    public String saveProduct(Producto producto) {
         try {
            em.persist(producto);
            return "Guardado";
        } catch (Exception e) {
            return "error";
        }
    }
}