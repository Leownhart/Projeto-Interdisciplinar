package Projeto;

import java.util.ArrayList;
 
public class Estoque {
    private int item_nu;
    private String item_nome;
    private int item_preco;

    public Estoque() {
    }
    
    // Métodos Getters e Setters
    public void setNu(int nu){
        this.item_nu = nu;
    }
    public int getNu(){
        return this.item_nu;
    }
    public void setNome(String nome){
        this.item_nome = nome;
    }
    public String getNome(){
        return this.item_nome;
    }
    public void setPreco(int preco){
        this.item_preco = preco;
    }
    public int getPreco(){
        return this.item_preco;
    }
    
    // Funções
    public void novoItem(Estoque s){
        this.item_nome = s.item_nome;
        this.item_nu = s.item_nu;
        this.item_preco = s.item_preco;
    }
    
    public void exibirItens(ArrayList<Estoque> arr){
        System.out.println("\n\n");
        if(arr.isEmpty()){
            System.out.println("Sem Item...");
            return;
        }
        System.out.println("Número d0 Item\t\tNome do Item\t\tPreço do Item");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Estoque estoque : arr){
            System.out.println(estoque.item_nu+"\t\t\t"+estoque.item_nome+"\t\t"+estoque.item_preco);
        }
        System.out.println("------------------------------------------------------------------------------------------"); 
        
        System.out.println("\n\n");
    }
}
