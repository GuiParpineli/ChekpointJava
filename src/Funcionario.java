import java.util.UUID;

public abstract class Funcionario {
    private  UUID id = UUID.randomUUID();
    private  String nome;
    private  String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return
                "id= " + id + "\n" +
                "nome= " + nome + "\n" +
                "cpf= " + cpf + "\n" +
                '}';
    }

    public UUID getId() {
        return id;
    }
}
