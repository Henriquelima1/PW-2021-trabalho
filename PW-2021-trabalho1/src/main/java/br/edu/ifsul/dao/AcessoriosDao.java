/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;


import br.edu.ifsul.modelo.Acessorios;
import java.io.Serializable;

/**
 *
 * @author Meu computador
 */
public class AcessoriosDao<TIPO> extends DAOGenerico<Acessorios> implements Serializable  {

    public AcessoriosDao() {
        super();
        classePersistente = Acessorios.class;
    }


}
