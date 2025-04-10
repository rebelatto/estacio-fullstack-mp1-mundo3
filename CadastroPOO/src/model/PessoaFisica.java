package model;

/**
 *
 * @author Jonison Rebelatto
 */
public class PessoaFisica extends Pessoa{
    private static final long serialVersionUID = 1L;

    private String cpf; 
    private int idade;

    public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibir(){
        super.exibir(id,nome);
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
    }
}
