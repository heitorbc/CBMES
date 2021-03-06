/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Empenho;
import br.gov.es.cb.sdro.model.Equipe;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class EmpenhoDAO  extends AbstractDAO<Empenho>{
    Empenho empenho;
    private List<Empenho> listaEmpenhos;
    
    public Empenho buscaEmpenhoPorNome(String nome) {
        busca = "Empenho.findByNome";
        parametro = "nome";
        empenho = buscaPorString(nome);
        return empenho;
    }
        
    public List<Empenho> buscaEmpenhoPorEquipe(Equipe equipe) {
        busca = "Empenho.findByIdequipe";
        parametro = "idequipe";
        query = em.createNamedQuery(busca);
        query.setParameter(parametro, equipe);
        return query.getResultList();
    }
    
    
    public List<Empenho> buscaEmpenhos(){
        busca = "Empenho.findAll";
        return (List<Empenho>) buscaListaSemParametro();
    }
}
