package jProj.paradigmas;
import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos {
    private ArrayList<ProdutoEstoque> listaProdutos = new ArrayList<>();
    public void adicionaProduto(ProdutoEstoque produto){
        listaProdutos.add(produto);
    }
    public List<ProdutoEstoque> getLista(){
        return listaProdutos;
    }
}
