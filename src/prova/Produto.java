/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;

/**
 *
 * @author elvis
 */
public class Produto {

 
    
    
    private String marca;
    private String nome;
    private int volume;
    private double valorCompra;
    
    private double valorVenda;
    private double valorLitro;
    private double valorCaixa;
    
    public static ArrayList<String> mercado;
    public static ArrayList<Double> preco;
    
    
    Produto(){
        
    }
    
    Produto(String nome, Double valorCompra){
        setNome(nome);
        setValorCompra(valorCompra);
       mercado = new ArrayList();
       preco = new ArrayList();
    }
    
    Produto(double valorCaixa, String nome, int volume){
       setValorCaixa(1000.00);
       setNome(nome);
       setVolume(volume);
       mercado = new ArrayList();
       preco = new ArrayList();
        
    }

    
       public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public static ArrayList<String> getMercado() {
        return mercado;
    }

    public static void setMercado(ArrayList<String> mercado) {
        Produto.mercado = mercado;
    }

    public static ArrayList<Double> getPreco() {
        return preco;
    }

    public static void setPreco(ArrayList<Double> preco) {
        Produto.preco = preco;
    }
    
    
    
    
}