package domain;

import java.time.LocalDate;

public class Audiencia {

    private Integer codigo;

    private LocalDate data;

    private String recomendacao;

    private Processo processo;

    public Audiencia(LocalDate data, Processo processo, String recomendacao) {
        this.data = data;
        this.processo = processo;
        this.recomendacao = recomendacao;
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

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }



}
