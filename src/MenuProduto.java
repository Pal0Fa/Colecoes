import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto {

    ArrayList<Produto> produtos = new ArrayList<>();


    int exibirMenu(){
        Scanner sc = new Scanner(System.in);
        int escolha = 1;


        System.out.println("[1] - Adicionar elementos na lista");
        System.out.println("[2] - Listar elementos existentes");
        System.out.println("[3] - Remover Produto");
        System.out.println("[4] - Exhibir informação da lista");
        System.out.println();
        System.out.println("[0] - Para SAIR");

        if(sc.hasNextInt()){
            escolha = sc.nextInt();
            this.executaAcao(escolha);
        } else {
            System.out.println("ERRO! Opcao invalida! Digite numero apresentado na lista de opcoes!");
            System.out.println();
        }

        return(escolha);
    }

    public void executaAcao(int escolha){
        switch (escolha) {
            case 1:
                this.cadastrar(escolha);
                break;
        
            default:
                break;
        }
    }

    public void cadastrar(int escolha){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preco do produto: ");
        double preco = sc.nextDouble();

        Produto p = new Produto(nome, preco);

        produtos.add(p);
        System.out.println("Produto adicionado com sucesso!");

        sc.close();
    }

}