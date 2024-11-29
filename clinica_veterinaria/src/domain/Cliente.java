package domain;

import java.util.List;

public class Cliente extends Pessoa {

     private String endereco;

     private Atendente cadastradoPor;

     private List<Pet> pets;

    public Cliente(Atendente cadastradoPor, String endereco, String nome, String telefone) {
        super(nome, telefone);
        this.cadastradoPor = cadastradoPor;
        this.endereco = endereco;
    }
     
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }

    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("endereco=").append(endereco);
        sb.append(", cadastradoPor=").append(cadastradoPor);
        sb.append('}');
        return sb.toString();
    }




}
