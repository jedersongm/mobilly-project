/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.padroes.mobilly.shared.service;

import br.edu.ifpb.ads.padroes.mobilly.shared.beans.Colaborador;
import java.util.List;

/**
 *
 * @author jederson
 */
public interface ServiceColaborador {
    
    public boolean salvar(Colaborador colaborador);
    
    public boolean excluir(Colaborador colaborador);
    
    public boolean atualizar(Colaborador colaborador);
    
    public Colaborador pesquisar(Class<Colaborador> entidade, Object chave);
    
    public List<Colaborador> listar();
    
    public Colaborador login(int cod, String senha);
}
