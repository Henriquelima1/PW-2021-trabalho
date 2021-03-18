package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Estado;
import java.io.Serializable;
import javax.ejb.Stateful;


@Stateful
public class EstadoDAO<TIPO>  extends DAOGenerico<Estado> implements Serializable {
    
    public EstadoDAO(){
        super();
        classePersistente = Estado.class;
    }

}
