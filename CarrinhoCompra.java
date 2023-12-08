package jProj.paradigmas;

import java.util.ArrayList;
import java.util.Objects;

public class CarrinhoCompra {
    private EstoqueProdutos estoque;
    private ArrayList<ProdutoEstoque> produtosCarrinho = new ArrayList<>();
    CarrinhoCompra(EstoqueProdutos estoque){
        this.estoque = estoque;
    }
    public void adicionaItem(String nome, int quantidade){
        for( ProdutoEstoque produto : this.estoque.getLista()){
            if(Objects.equals(produto.getNome(), nome)){
                ProdutoEstoque novoProduto = new ProdutoEstoque(nome, produto.getValor(), quantidade);
                produtosCarrinho.add(novoProduto);
            }
        }
    }
    public void finalizaCompra(){
        for( ProdutoEstoque produtoCarrinho : this.produtosCarrinho){
            for( ProdutoEstoque produto : this.estoque.getLista()){
                if(Objects.equals(produto.getNome(), produtoCarrinho.getNome())){
                    produto.retirada(produtoCarrinho.getQuantidade());
                }
            }
        }
    }
    public int calculaTotal(){
        int total = 0;
        for( ProdutoEstoque produtoCarrinho : this.produtosCarrinho){
            total += produtoCarrinho.getQuantidade() * produtoCarrinho.getValor();
        }
        return total;
    }
}
