package centralizado;

public class LinhaDePedido {

    private Integer quantidade;

    private Produto produto;

    public LinhaDePedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer obterQuantidade() {
        return quantidade;
    }

    public Produto obterProduto() {
        return produto;
    }

}
