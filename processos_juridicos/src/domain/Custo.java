package domain;

import java.time.LocalDate;

public class Custo {

    private Integer codigo;

    private LocalDate data;

    private String descricao;

    private Double valor;

    private Processo processo;

    public Custo(LocalDate data, String descricao, Processo processo, Double valor) {
        this.data = data;
        this.descricao = descricao;
        this.processo = processo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }




}
