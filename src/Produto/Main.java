package Produto;

public class Main {
  public static void main(String[] args){
    Produto p = new Produto("Teclado", 250, 37);

    p.mostrarDetalhes();

    p.setNome("Mouse");
    p.setPreco(80.8);
    p.setQtdEstoque(19);

    p.mostrarDetalhes();

  }
}
