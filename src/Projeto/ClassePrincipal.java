package Projeto;

import java.util.ArrayList;
import java.util.Scanner;
// Controle Básico de Estoque

public class ClassePrincipal {
    
    private static Scanner sc;
    private static ArrayList<Estoque> listaEstoque = new ArrayList<Estoque>();
    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    static void menu() {
        System.out.println("1 - Adicionar Item ");
        System.out.println("2 - Exibir todos os Itens ");
        System.out.println("3 - Adicionar desconto do Cliente ");
        System.out.println("0 - Sair do Sistema ");
    }

    public static void main(String[] args) {
        int opcao;
        sc = new Scanner(System.in);
         
        do {
            Estoque s = new Estoque();
            menu();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Informe o número do Item: ");
                    s.setNu(sc.nextInt());
                    System.out.print("Informe o nome do Item: ");
                    sc = new Scanner(System.in);
                    s.setNome(sc.nextLine());
                    sc.next();
                    System.out.print("Informe o preço do Item: ");
                    s.setPreco(sc.nextInt());
                    s.novoItem(s);
                    listaEstoque.add(s);
                    break;
                case 2:
                    s.exibirItens(listaEstoque);
                    break;
                case 3:
                    sellOutDetails();
                    break;
                default:
                    break;
            }

        } while (opcao != 0);
    }
 
    private static void sellOutDetails() {
        sc = new Scanner(System.in);
        Cliente c = new Cliente();
        
        System.out.println("Informe o nome do Cliente: ");
        c.setCliente_nome(sc.nextLine());
        
        System.out.println("Informe o número do Item: ");
        c.setItem_numero(sc.nextInt());
        
        System.out.println("Informe a quantidade: ");
        c.setCompra_qtd(sc.nextInt());
        
        c.AdicionarDetalhes(c);
        listaCliente.add(c);
        
        //System.out.println("Você precisa de mais Items? [S/N]");
        String escolha = ""; // Inicializando a váriavel
        
        sc.nextLine();
        if(escolha.contains("S")){
            // este
            sellOutDetails();
        }
        else
        {
            // mostrar conta
            c.ExibirCompra(listaCliente, c.getCliente_nome(), listaEstoque);
        }
        
    }
}
