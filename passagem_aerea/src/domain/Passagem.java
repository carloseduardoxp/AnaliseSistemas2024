package domain;

public class Passagem {

    private String reserva;

    private Double valor;

    private Cliente cliente;

    public Passagem(String reserva, Double valor, Cliente cliente) {
        this.reserva = reserva;
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}
