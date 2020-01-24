package br.com.systems.apidocs.entity.CNPJ;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


public class Cnpj {

	@JsonInclude(Include.NON_NULL)
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String cnpj;
    private String tipo; // MATRIZ ou FILIAL
    private String dtAbertura;
    private String razaoSocial;
    private String nomeFantasia;
    private ArrayList<Atividade> atividadePrincipal;
    private ArrayList<Atividade> atividadeSecundaria;
    private String naturezaJuridica;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String municipio;
    private String uf;
    private String email;
    private String telefone;
    private String enteFederativoResponsavel;
    private String situacao;
    private String dtSituacao;
    private String motivoSituacao;
    private String situacaoEspecial;
    private String dtSituacaoEspecial;
    private String capitalSocial;
    private ArrayList<Qsa> Qsa;

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDtAbertura() {
        return this.dtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public ArrayList<Atividade> getAtividadePrincipal() {
        return this.atividadePrincipal;
    }

    public void setAtividadePrincipal(ArrayList<Atividade> atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    public ArrayList<Atividade> getAtividadeSecundaria() {
        return this.atividadeSecundaria;
    }

    public void setAtividadeSecundaria(ArrayList<Atividade> atividadeSecundaria) {
        this.atividadeSecundaria = atividadeSecundaria;
    }

    public String getNaturezaJuridica() {
        return this.naturezaJuridica;
    }

    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnteFederativoResponsavel() {
        return this.enteFederativoResponsavel;
    }

    public void setEnteFederativoResponsavel(String enteFederativoResponsavel) {
        this.enteFederativoResponsavel = enteFederativoResponsavel;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDtSituacao() {
        return this.dtSituacao;
    }

    public void setDtSituacao(String dtSituacao) {
        this.dtSituacao = dtSituacao;
    }

    public String getMotivoSituacao() {
        return this.motivoSituacao;
    }

    public void setMotivoSituacao(String motivoSituacao) {
        this.motivoSituacao = motivoSituacao;
    }

    public String getSituacaoEspecial() {
        return this.situacaoEspecial;
    }

    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public String getDtSituacaoEspecial() {
        return this.dtSituacaoEspecial;
    }

    public void setDtSituacaoEspecial(String dtSituacaoEspecial) {
        this.dtSituacaoEspecial = dtSituacaoEspecial;
    }

    public String getCapitalSocial() {
        return this.capitalSocial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public ArrayList<Qsa> getQsa() {
        return this.Qsa;
    }

    public void setQsa(ArrayList<Qsa> Qsa) {
        this.Qsa = Qsa;
    }
    
}