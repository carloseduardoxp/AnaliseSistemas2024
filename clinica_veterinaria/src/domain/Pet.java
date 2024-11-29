package domain;

import java.time.LocalDate;

public class Pet {

    private Integer codigo;

    private String nome;

    private LocalDate dataNascimento;

    private GeneroEnum genero;

    private Cliente tutor;

    private Especie especie;

    public Pet(LocalDate dataNascimento, Especie especie, GeneroEnum genero, String nome, Cliente tutor) {
        this.dataNascimento = dataNascimento;
        this.especie = especie;
        this.genero = genero;
        this.nome = nome;
        this.tutor = tutor;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pet{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome=").append(nome);
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", genero=").append(genero);
        sb.append(", tutor=").append(tutor);
        sb.append(", especie=").append(especie);
        sb.append('}');
        return sb.toString();
    }




}
