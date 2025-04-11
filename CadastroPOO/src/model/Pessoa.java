package model;
import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getNome(){
       return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    protected void exibir(int id, String nome){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

}
