package model;

public class Estoque {
    
    private Long id_Estoque;
    private Long id_Produto;
    private Double quantidade;
    private Produto produto;

    public Long getId_Estoque() {
        return id_Estoque;
    }

    public void setId_Estoque(Long id_Estoque) {
        this.id_Estoque = id_Estoque;
    }

    public Long getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(Long id_Produto) {
        this.id_Produto = id_Produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
    
}
