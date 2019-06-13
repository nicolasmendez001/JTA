package co.edu.uptc.sw2.transaccion.persistencia.entities;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Cliente;
import co.edu.uptc.sw2.transaccion.persistencia.entities.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-13T18:17:09")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Cliente> cliente;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Producto> producto;
    public static volatile SingularAttribute<Compra, Integer> numeroUnidades;

}