/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.transaccion.servicios.logica;

import co.edu.uptc.sw2.transaccion.persistencia.CompraDao;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Compra;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CompraLogica {
    
    @EJB
    private CompraDao dao;

    public String saveCompra(Compra compra) {
       return dao.saveCompra(compra);
    }
}
