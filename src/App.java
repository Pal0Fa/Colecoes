import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        MenuProduto m = new MenuProduto();
        int escolha = 0;
        do{

            escolha = m.exibirMenu();

        } while(escolha != 0);

    }
}
