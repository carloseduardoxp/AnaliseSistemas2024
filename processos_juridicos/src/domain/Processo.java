package domain;

import java.time.LocalDate;

public class Processo {

    private String numero;

    private LocalDate dataAbertura;

    private Vara vara;

    private Pessoa cliente;

    private Pessoa parteContraria;

    public Processo(Pessoa cliente, LocalDate dataAbertura, String numero, Pessoa parteContraria, Vara vara) {
        this.cliente = cliente;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.parteContraria = parteContraria;
        this.vara = vara;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Vara getVara() {
        return vara;
    }

    public void setVara(Vara vara) {
        this.vara = vara;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getParteContraria() {
        return parteContraria;
    }

    public void setParteContraria(Pessoa parteContraria) {
        this.parteContraria = parteContraria;
    }




}
