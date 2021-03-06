/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Usuario;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author ricardo
 */
public class UsuarioDAO extends AbstractDAO<Usuario> {

    Usuario usuario;
   
    public Usuario buscaUsuarioPorNome(String login) {
        busca = "Usuario.findByLogin";
        parametro = "login";
        usuario = buscaPorString(login);
        return usuario;
    }

    public Usuario checaLogin(String login, String senha) {
        try {
            em.getTransaction().begin();
            busca = "Usuario.checaLogin";
           TypedQuery<Usuario> query = (TypedQuery<Usuario>) em.createNamedQuery(busca);
            parametro = "login";
            query.setParameter(parametro, login);
            parametro = "senha";
            query.setParameter(parametro, senha);
            List<Usuario> users  = query.getResultList();
            em.getTransaction().commit();
            if(!users.isEmpty()){
                return users.get(0);
            }
            else{
              return null;  
            }
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public List<Usuario> buscaUsuarios() {
        busca = "Usuario.findAll";
        return (List<Usuario>) buscaListaSemParametro();
    }

    public Usuario buscaUsuarioPorId(Integer id) {
        try {
            busca = "Usuario.findByIdusuario";
            parametro = "idusuario";
            usuario = buscaPorInteger(id);
            return usuario;
        } catch (NoResultException e) {
           throw e;
        }
    }
}
