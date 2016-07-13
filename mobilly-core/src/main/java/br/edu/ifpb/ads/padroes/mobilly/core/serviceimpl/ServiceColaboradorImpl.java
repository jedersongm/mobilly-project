/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.padroes.mobilly.core.serviceimpl;

import br.edu.ifpb.ads.padroes.mobilly.core.dao.ColaboradorDao;
import br.edu.ifpb.ads.padroes.mobilly.shared.beans.Colaborador;
import br.edu.ifpb.ads.padroes.mobilly.shared.service.ServiceColaborador;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jederson
 */
@Stateless
@Remote(ServiceColaborador.class)
public class ServiceColaboradorImpl  implements ServiceColaborador{
    
    @Inject
    private ColaboradorDao colaboradorDao;
    
    @Override
    public boolean salvar(Colaborador colaborador) {
        return colaboradorDao.salvar(colaborador);
    }

    @Override
    public boolean excluir(Colaborador colaborador) {
        return colaboradorDao.excluir(colaborador);
    }

    @Override
    public boolean atualizar(Colaborador colaborador) {
        return colaboradorDao.atualizar(colaborador);
    }

    @Override
    public Colaborador pesquisar(Class<Colaborador> entidade, Object chave) {
        return colaboradorDao.pesquisar(entidade,chave);
    }

    @Override
    public List<Colaborador> listar() {
        return colaboradorDao.listar();
    }

    @Override
    public Colaborador login(int cod, String senha) {
        return colaboradorDao.login(cod, senha);
    }
    
}
