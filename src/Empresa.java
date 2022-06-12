import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String endereco;
    private String cnpj;
    private List funcionarios = new ArrayList();

    public Empresa(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa: " + "\n" +
                "Nome= " + nome + "\n" +
                "Endereco= " + endereco + "\n" +
                "Cnpj= " + cnpj + "\n" +
                "Funcionarios= " + "\n" + funcionarios + "\n";
    }

    public void registrarFuncionario(Object novoFuncionario) {
        funcionarios.add(novoFuncionario);
    }
}
