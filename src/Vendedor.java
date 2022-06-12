public class Vendedor extends Funcionario{
    private Integer comissao;

    public Vendedor(String nome, String cpf, Integer comissao) {
        super(nome, cpf);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "\n" +
                "comissao= " + comissao + "%" + "\n"
                + super.toString();
    }

    public void efetuarVenda(){

    };

}
