/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class Principal {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> mercado = new ArrayList();
    public static ArrayList<Double> preco = new ArrayList();
    
    public static void main(String[] args) {
        int opcao;

        Produto me = new Produto();

        while (true) {
            System.out.println("========================");
            System.out.println("=====Bar do Mussum======");
            System.out.println("========================");
            System.out.println("1. Adicionar o produto: ");
            System.out.println("2. Listar Produto: ");
            System.out.println("3. Vender um produto: ");
            System.out.println("5. Finalizar: ");
            System.out.println("Opção: ");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1:
                    AdcionarProdEstoque();
                    break;

                case 2:
                    PesquisarProd();
                    break;

                case 3:
                    VenderProd();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opçao invalida. ");
            }
        }

    }

    public static void AdcionarProdEstoque() {
        System.out.println("Produto: ");
        
        String nome = input.nextLine();
        mercado.add(nome);
        System.out.println("Informe o preço: ");
        double prec = input.nextInt();
        preco.add(prec);
        
        System.out.println("Cadastrado...");
    }

    public static void PesquisarProd() {
        int conta = 0;
        System.out.println();
        System.out.println("Digite o produto para pesquisar: ");
        String prod = input.nextLine();
   
        System.out.println("Lista de produtos: ");
        System.out.println("-------------------");
        for (int i = 0; i < mercado.size(); i++) {
         
            System.out.println(mercado.get(i));
        }
    }

    public static void VenderProd() {
        System.out.println("Informe o produto a ser vendido: ");
        String prod = input.nextLine();
        
       // String tam = mercado.size();
        
      
    }
}
