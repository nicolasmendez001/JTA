package co.edu.uptc.sw2.transaccion.persistencia.entities;

import co.edu.uptc.sw2.transaccion.persistencia.entities.Tarjeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-13T18:17:09")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> name;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> numeroDocumento;
    public static volatile SingularAttribute<Cliente, Tarjeta> tarjeta;

}