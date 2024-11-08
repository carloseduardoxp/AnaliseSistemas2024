package domain;

public class Cidade {
    private Integer codigo;

    private String nome;

    private Long populacao;

    public Cidade(String nome, Long populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    
}