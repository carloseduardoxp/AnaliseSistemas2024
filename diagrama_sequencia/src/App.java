import centralizado.Cliente;
import centralizado.LinhaDePedido;
import centralizado.Pedido;
import centralizado.Produto;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto(2500.0); //PS5
        Produto produto2 = new Produto(7000.0); //iPhone PRo Max

        Cliente cliente = new Cliente(10.0); //carlos

        LinhaDePedido linha1 = new LinhaDePedido(4, produto1);
        LinhaDePedido linha2 = new LinhaDePedido(2, produto2);

        Pedido pedido = new Pedido(cliente, Arrays.asList(linha1,linha2));

        System.out.println(pedido.calcularPreco());
    }
}
