package model;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 *
 * @author Jonison Rebelatto
 */

public class PessoaFisicaRepo  implements Serializable{
    private ArrayList<PessoaFisica> pessoas = new ArrayList<>();
   
   public void inserir(PessoaFisica pessoaFisica) {
        pessoas.add(pessoaFisica);
        System.out.println("Pessoa física inserida: " + pessoaFisica.getNome());
   }

}
