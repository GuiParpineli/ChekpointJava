import java.util.UUID;

public class Produto {
    private UUID id = UUID.randomUUID();
    private String nome;
    private String descricao;
    private Double valorCompra;
    private Double valorVenda;
    private Integer estoque;

    public Produto(String nome, String descricao, Double valorCompra, Double valorVenda, Integer estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.estoque = estoque;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public Integer getEstoque() {
        return estoque;
    }
}
