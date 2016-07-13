/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.padroes.mobilly.shared.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jederson
 */
@Entity
public class Colaborador implements Serializable {
    
    @Id
    @GeneratedValue
    private long cod;
    private String nome;
    private String email;
    private String senha;
    private String celular;
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate dataNascimento;
    private String sexo;
    private String CPF;
    private String cargo;
    @Embedded
    private Endereço endereco;
    @Embedded
    private CNH cnh;
    @OneToOne(mappedBy = "colaborador",cascade = CascadeType.ALL)
    private Locacao locacao;
    @OneToOne(mappedBy = "colaborador", cascade = CascadeType.ALL)
    private Reserva reserva;
   

    public Colaborador() {
    }

    public Colaborador(long cod, String nome, String email, String senha, String celular, LocalDate dataNascimento, String sexo, String CPF, String cargo, Endereço endereco, CNH cnh, Locacao locacao, Reserva reserva) {
        this.cod = cod;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.cargo = cargo;
        this.endereco = endereco;
        this.cnh = cnh;
        this.locacao = locacao;
        this.reserva = reserva;        
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public CNH getCnh() {
        return cnh;
    }

    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.cod ^ (this.cod >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Colaborador other = (Colaborador) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }
    
    
}
