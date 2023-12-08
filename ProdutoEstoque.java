package jProj.paradigmas;

public class ProdutoEstoque{
    private String nome;
    private int valor;
    private int quantidade;
    ProdutoEstoque( String nome, int valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getValor(){
        return this.valor;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void retirada(int quantidade){
        if(this.quantidade >= quantidade){
            this.quantidade -= quantidade;
        }
    }
}
