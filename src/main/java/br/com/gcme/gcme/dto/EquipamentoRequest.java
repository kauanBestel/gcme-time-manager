package br.com.gcme.gcme.dto;

public class EquipamentoRequest {
    
    private Long codigo_equip;
    private String nome_equip;
    private String marca_equip;
    private String descricao;
    private String range_tipo;
    private String imagem;
    private String numero_serie;
    private String modelo;

    private Long empresaId; //adicionei para enviarmos qual empresa ele pertence

    public Long getCodigo_equip() {
        return codigo_equip;
    }
    public void setCodigo_equip(Long codigo_equip) {
        this.codigo_equip = codigo_equip;
    }
    public String getNome_equip() {
        return nome_equip;
    }
    public void setNome_equip(String nome_equip) {
        this.nome_equip = nome_equip;
    }
    public String getMarca_equip() {
        return marca_equip;
    }
    public void setMarca_equip(String marca_equip) {
        this.marca_equip = marca_equip;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getRange_tipo() {
        return range_tipo;
    }
    public void setRange_tipo(String range_tipo) {
        this.range_tipo = range_tipo;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public String getNumero_serie() {
        return numero_serie;
    }
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Long getEmpresaId() {
        return empresaId;
    }
    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }


}
