package br.com.githubauto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando a automação do GitHub");
        //Criar instanicas das outras classes


        GitManager git = new GitManager();
        git.addAndCommit("commit automatico de teste");
        git.pushChanges();
    }




    }
}
