package br.com.systems.apidocs.entity.CNPJ;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Atividade {

	@JsonInclude(Include.NON_NULL)
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String cnae;
    private String descricao;

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getCnae() {
        return this.cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}