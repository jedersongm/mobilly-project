/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.padroes.mobilly.shared.service;

import br.edu.ifpb.ads.padroes.mobilly.shared.beans.Locacao;
import br.edu.ifpb.ads.padroes.mobilly.shared.beans.Reserva;
import java.util.List;

/**
 *
 * @author jederson
 */
public interface ServiceReserva {
    
    public boolean salvar(Reserva reserva);

    public boolean excluir(Reserva reserva);

    public boolean atualizar(Reserva reserva);

    public Locacao pesquisar(Class<Reserva> entidade, Object chave);

    public List<Reserva> listar();
    
}
