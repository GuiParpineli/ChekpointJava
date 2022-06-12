import java.util.UUID;
public class Cliente {
    private  UUID id = UUID.randomUUID();
    private String nome;
    private String cnpj;
    private String endereco;

    public Cliente(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n" +
                "id=" + id + "\n" +
                "nome='" + nome + "\n" +
                "cnpj='" + cnpj + "\n" +
                "endereco='" + endereco + "\n" +
                '}';
    }

    public void efetuarPedido(){ }
}
