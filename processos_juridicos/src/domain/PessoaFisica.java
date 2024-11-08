package domain;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String cpf, String email, String nome) {
        super(email, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
