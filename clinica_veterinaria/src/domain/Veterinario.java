package domain;

public class Veterinario extends Pessoa {

    private String crmv;

    public Veterinario(String crmv, String nome, String telefone) {
        super(nome, telefone);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "Veterinario [codigo=" + codigo + ", crmv=" + crmv + ", nome=" + nome + ", telefone=" + telefone + "]";
    }

    


}
