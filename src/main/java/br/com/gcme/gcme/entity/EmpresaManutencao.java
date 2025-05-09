package br.com.gcme.gcme.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa_manutencao")

public class EmpresaManutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEmpresa;
    private String contatoNumero;
    private String contatoEmail;
    private String observacao;
 
    public EmpresaManutencao(){}
    public EmpresaManutencao(Long id) { this.id = id; }


    public EmpresaManutencao(Long id, String nomeEmpresa, String contatoNumero, String contatoEmail, String observacao)
    {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.contatoNumero = contatoNumero;
        this.contatoEmail = contatoEmail;
        this.observacao = observacao;
    }
    

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }


    public String getContatoNumero() {
        return contatoNumero;
    }
    public void setContatoNumero(String contatoNumero) {
        this.contatoNumero = contatoNumero;
    }


    public String getContatoEmail() {
        return contatoEmail;
    }
    public void setContatoEmail(String contatoEmail) {
        this.contatoEmail = contatoEmail;
    }


    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}