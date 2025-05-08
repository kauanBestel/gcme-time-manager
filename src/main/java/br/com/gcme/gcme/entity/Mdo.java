package br.com.gcme.gcme.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPRESA_MANUTENCAO")

public class Mdo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_empresa;
    private String contato_numero;
    private String contato_email;
    private String observacao;

    @OneToMany(mappedBy = "empresa")
    private Set<Equipamento> equipamentos = new HashSet<>();


    public Mdo(){
    }

    public Mdo(Long id, String nome_empresa, String contato_numero, String contato_email, String observacao)
    {
        this.id = id;
        this.nome_empresa = nome_empresa;
        this.contato_numero = contato_numero;
        this.contato_email = contato_email;
        this.observacao = observacao;
    }
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getNomeEmpresa() {
        return nome_empresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nome_empresa = nomeEmpresa;
    }


    public String getContatoNumero() {
        return contato_numero;
    }
    public void setContatoNumero(String contato_numero) {
        this.contato_numero = contato_numero;
    }


    public String getContatoEmail() {
        return contato_email;
    }
    public void setContatoEmail(String contato_email) {
        this.contato_email = contato_email;
    }


    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Set<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Set<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
}