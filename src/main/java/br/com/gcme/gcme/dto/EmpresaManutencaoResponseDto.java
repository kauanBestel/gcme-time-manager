package br.com.gcme.gcme.dto;

public class EmpresaManutencaoResponseDto {
    
    private Long Id;
    private String nomeEmpresa;
    private String contatoNumero;
    private String contatoEmail;
    private String observacao;
    
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

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }

}
