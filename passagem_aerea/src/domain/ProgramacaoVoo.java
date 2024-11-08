package domain;

import java.time.LocalDateTime;

public class ProgramacaoVoo {

    private Integer codigo;
    private Voo voo;
    private LocalDateTime dataPartida;
    private LocalDateTime dataChegada;
    private String nomeAeronave;
    private Integer quantidadePassageiros;

    public ProgramacaoVoo(Voo voo, LocalDateTime dataPartida, LocalDateTime dataChegada, String nomeAeronave,
            Integer quantidadePassageiros) {
        this.voo = voo;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.nomeAeronave = nomeAeronave;
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public LocalDateTime getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDateTime dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDateTime getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDateTime dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getNomeAeronave() {
        return nomeAeronave;
    }

    public void setNomeAeronave(String nomeAeronave) {
        this.nomeAeronave = nomeAeronave;
    }

    public Integer getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(Integer quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    
    

}
