package model;

public class PessoaJuridica extends Pessoa{
    private static final long serialVersionUID = 1L;

    private String cnpj;
     
    public PessoaJuridica(int id, String nome, String cnpj){
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
     public void exibir(){
        super.exibir(id, nome);
        System.out.println("CNPJ: " + getCnpj());
    }
}
