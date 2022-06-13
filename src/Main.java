public class Main {
    public static void main(String[] args) {
        Empresa brinkStore = new Empresa("BrinkStore","Rua Joao de Barro 56","11.231.12123.0001-33");

        Vendedor vendor1 = new Vendedor("jao", "10.413.666-11", 9);
        System.out.println(vendor1.getId());
        System.out.println(vendor1.toString());
        System.out.println("------------------------------>>");
        brinkStore.registrarFuncionario(vendor1);
        System.out.println(brinkStore.toString());

        Clt clt1 = new Clt("Sofia", "13.342.1123-00");
        clt1.gerenciarSistema(true);
        System.out.println(clt1.toString());
        System.out.println("------------------------------>>");

        Cliente cliente01 = new Cliente("Marcia", "03.12313.0222.0001-33", "rua Flores 21");
        System.out.println(cliente01);
        System.out.println("------------------------------>>");
        Produto carrinho = new Produto("Carrinho Hot Wheels", "Carrinho de metal miniatura", 3.5, 9.0, 20);

        Produto boneca = new Produto("Boneca Xing Ling", "Boneca Bem ruim", 0.5, 2.0, 100);
        Pedido novoPedido = new Pedido("jao", "Sofia");
        novoPedido.addProdutos("Carrinho Hot Wheels");
        novoPedido.addProdutos("Boneca Xing ling");
        System.out.println(novoPedido.toString());
        System.out.println("------------------------------>>");
    }
}