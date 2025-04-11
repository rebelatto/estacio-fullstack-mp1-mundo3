package cadastropoo;

import model.*;
import view.*;


public class CadastroPOO {

    public static void main(String[] args) {

    //Pratica 1
       try {
          PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
          repo1.inserir(new PessoaFisica(1, "Ana", "11111111111", 25));
          repo1.inserir(new PessoaFisica(2, "Carlos", "22222222222", 52));
          repo1.persistir("pf_repo.dat");

          PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
          repo2.recuperar("pf_repo.dat");
          for (PessoaFisica pf : repo2.obterTodos()) {
             pf.exibir();
          }

          PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
          repo3.inserir(new PessoaJuridica(3, "XPTO Sales", "33333333333333"));
          repo3.inserir(new PessoaJuridica(4, "XPTO Solutions", "44444444444444"));
          repo3.persistir("pj_repo.dat");

          PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
          repo4.recuperar("pj_repo.dat");
          for (PessoaJuridica pj : repo4.obterTodos()) {
             pj.exibir();
          }

       } catch (Exception e) {
          e.printStackTrace();
       }

       //Pratica 2
       Menu menu = new Menu();
       menu.exibirMenu();
    }   
}
