package co.edu.uptc.sw2.transaccion.persistencia;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Cliente;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Compra;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Producto;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Tarjeta;
import co.edu.uptc.sw2.transaccion.servicios.logica.exepctions.ManejoExcepciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CompraDao {

    @PersistenceContext
    private EntityManager em;

    public String saveCompra(Compra compra) {

        
        //Numero de la tajerta
        String idTarjeta = compra.getCliente().getTarjeta().getNumero();
        
        //Consulta existe Tarjeta
        String getTarjeta = "select t from Tarjeta t where t.numero = '" + idTarjeta + "'";
        
        Tarjeta tarjeta = null;
        try {
            //Obtener la tajeta de la DB
             tarjeta = (Tarjeta) em.createQuery(getTarjeta).getSingleResult();
             
        } catch (Exception e) {
            throw new ManejoExcepciones("La tarjeta no existe");
        }
        
        compra.getCliente().setTarjeta(tarjeta);
        
        // obtener el cliente
        String getCliente = "select c from Cliente where c.numeroDocumento = "+ compra.getCliente().getNumeroDocumento();
        try {
            em.createQuery(getCliente).getSingleResult();
        } catch (Exception e) {
            System.out.println("Entra al catch");
            em.persist(compra.getCliente());
        }
        
        em.persist(compra);
        
          String getProducto = "select p from Producto where c.id = "+ compra.getProducto().getId();
          Producto producto = (Producto) em.createQuery(getCliente).getSingleResult();
          
          if (producto.getUnidadDisponible() > compra.getNumeroUnidades()) {
            producto.setUnidadDisponible((producto.getUnidadDisponible() - compra.getNumeroUnidades()));
            em.refresh(producto);
        }else{
              throw new ManejoExcepciones("No hay unidades disponibles");
          }
        
          
        //Total a pagar
        Long total = compra.getNumeroUnidades() * compra.getProducto().getValor();
        
        if (compra.getCliente().getTarjeta().getMonto() < total) {
            throw new ManejoExcepciones("No cuenta con el dinero suficiente");
        }else{
            compra.getCliente().getTarjeta().setMonto(compra.getCliente().getTarjeta().getMonto() - total);
            em.refresh(compra.getCliente().getTarjeta());
        }
        
        /*try {
            em.persist(compra);
            return "ok";
        } catch (Exception e) {
            return "error";
        }*/
        return "Compra finalizada";
    }
}