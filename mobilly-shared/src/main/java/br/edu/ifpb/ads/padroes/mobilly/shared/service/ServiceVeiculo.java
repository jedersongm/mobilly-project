/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.padroes.mobilly.shared.service;

import br.edu.ifpb.ads.padroes.mobilly.shared.beans.Veiculo;
import java.util.List;

/**
 *
 * @author jederson
 */
public interface ServiceVeiculo {

    public boolean salvar(Veiculo veiculo);

    public boolean excluir(Veiculo veiculo);

    public boolean atualizar(Veiculo veiculo);

    public Veiculo pesquisar(Class<Veiculo> entidade, Object chave);

    public List<Veiculo> listar();
}