public class Clt extends Funcionario {
    private boolean permissaoSistema;

    public Clt(String nome, String cpf) {
        super(nome, cpf);
    }

    public Boolean gerenciarSistema(Boolean a) {
        return permissaoSistema = a;
    }

    @Override
    public String toString() {
        return "Clt{" + "\n" +
                "permissaoSistema= " + permissaoSistema + "\n" +
                super.toString();
    }
}
