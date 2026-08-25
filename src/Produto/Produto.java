package Produto;

public class Produto{
  private String nome;
  private double preco;
  private int qtdEstoque;

  public Produto(String n, double p, int qtd){
    this.setNome(n);
    this.setPreco(p);
    this.setQtdEstoque(qtd);
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String n){
    this.nome = n;
  }

  public double getPreco(){
    return this.preco;
  }

  public void setPreco(double p){
    this.preco = p;
  }

  public int getQtdEstoque(){
    return this.qtdEstoque;
  }

  public void setQtdEstoque(int q){
    this.qtdEstoque = q;
  }

  public void mostrarDetalhes(){
    System.out.println("\n===================== DETALHES DO " + getNome().toUpperCase() + " =====================");
    System.out.println("\nNome do produto: " + getNome());
    System.out.println("Preço: R$" + getPreco());
    System.out.println("Quantidade em estoque: " + getQtdEstoque());
  }
}