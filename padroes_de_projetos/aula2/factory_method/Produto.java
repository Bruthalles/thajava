package padroes_de_projetos.aula2.factory_method;
public class Produto{
    private String nome;
    private double precoBase;

public Produto(String nome,double precoBase){
    this.nome = nome;
    this.precoBase = precoBase;
}

public String getNome(){
    return nome;
}

public double getPrecoBase(){
    return precoBase;
}
}