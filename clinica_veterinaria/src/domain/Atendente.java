package domain;

import java.util.List;

public class Atendente extends Pessoa {

    private Double salario;

    private List<Cliente> clientesCadastrados;

    public Atendente(Double salario, String nome, String telefone) {
        super(nome, telefone);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    

    @Override
    public String toString() {
        return "Atendente [codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + ", telefone=" + telefone
                + "]";
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

    public void setClientesCadastrados(List<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }



    
    

}
