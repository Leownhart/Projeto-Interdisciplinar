package Projeto;

import java.util.ArrayList;

public class Cliente {
    private int cliente_id;
    private String cliente_nome;
    private int compra_qtd;
    private int item_numero;
    private float conta_total;

    public Cliente() {
        
    }
    
    public void AdicionarDetalhes(Cliente c){
        this.cliente_nome = c.cliente_nome;
        this.item_numero = c.item_numero;
        this.compra_qtd = c.compra_qtd;
    }
    
    public float ExibirCompra(ArrayList<Cliente> arr, String clien_nome, ArrayList<Estoque> listaEstoque){
        float total = 0;
        System.out.println("\n\n\nNúmero de Itens\t\tNome do Item\t\tPreço do Item" );
        System.out.println("------------------------------------------------------------------------------------------");
        
        for (Cliente c : arr) {
            if (c.cliente_nome.equals(clien_nome)){
                
            System.out.println( c.item_numero+"\t\t"+c.cliente_nome+"\t\t\t"+c.compra_qtd);
                for (Estoque estoque : listaEstoque) {
                    
                    if(estoque.getNu() == c.item_numero){
                        total += c.compra_qtd * estoque.getPreco();
                    }
                     
                }
                
           }
        }
        System.out.println("------------------------------------------------------------------------------------------"); 
        
        System.out.println("Total da Conta Sem Desconto == " + total);
        float dis = 0;
        if(total < 200){
            dis = total * 15 / 100;
        }
        else{
            if(total >= 200 && total < 700){
                dis = (total*25) / 100;
            }
            else {
                if (total > 700);
                    dis = (total * 50) / 100;
            }
        }
        System.out.println("\n\n------------------------------------------------------------------------------------------"); 
    
        System.out.println("Total da Conta Depois do Desconto == " + (total - dis));
        
        for (Cliente cli : arr){
            if(cli.getCliente_nome().equals(cliente_nome)){
                cli.setConta_total(total);
            }
        }
        System.out.println("\n\n------------------------------------------------------------------------------------------"); 
        
        return (total - dis);
        
    }
            
    // getter setters
    
    public float getConta_total() {
        return conta_total;
    }

    public void setConta_total(float conta_total) {
        this.conta_total = conta_total;
    }
    
    public int getItem_numero() {
        return item_numero;
    }

    public void setItem_numero(int item_numero) {
        this.item_numero = item_numero;
    }

    public int getCompra_qtd() {
        return compra_qtd;
    }
    
    public void setCompra_qtd(int compra_qtd) {
        this.compra_qtd = compra_qtd;
    }
    
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }
}
