package br.com.systems.apidocs.entity.CNPJ;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity 
public class Qsa {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomeSocio;
    private String qualSocio;
    private String paisOrigemSocio;
    private String nomeRepLegal;
    private String qualRepLegal;

    public String getNomeSocio() {
        return this.nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    public String getQualSocio() {
        return this.qualSocio;
    }

    public void setQualSocio(String qualSocio) {
        this.qualSocio = qualSocio;
    }

    public String getPaisOrigemSocio() {
        return this.paisOrigemSocio;
    }

    public void setPaisOrigemSocio(String paisOrigemSocio) {
        this.paisOrigemSocio = paisOrigemSocio;
    }

    public String getNomeRepLegal() {
        return this.nomeRepLegal;
    }

    public void setNomeRepLegal(String nomeRepLegal) {
        this.nomeRepLegal = nomeRepLegal;
    }

    public String getQualRepLegal() {
        return this.qualRepLegal;
    }

    public void setQualRepLegal(String qualRepLegal) {
        this.qualRepLegal = qualRepLegal;
    }    

}