import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private UUID id = UUID.randomUUID();
    private String vendedor;
    private String cliente;
    private List produtos = new ArrayList();

    public Pedido(String vendedor, String cliente) {
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public List getProdutos() {
        return produtos;
    }

    public void addProdutos(String nomeProduto) {
        produtos.add(nomeProduto);
        System.out.println("Produto Adicionado com Sucesso!");
    }

    @Override
    public String toString() {
        return "Pedido{" + "\n" +
                "id= " + id + "\n" +
                "vendedor= " + vendedor + "\n" +
                "cliente= " + cliente + "\n" +
                "produtos= " + produtos +
                '}';
    }
}
