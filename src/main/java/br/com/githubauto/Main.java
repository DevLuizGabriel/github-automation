package br.com.githubauto;

import org.eclipse.jgit.api.Git;

public class Main {
    public static void main(String[] args) {





        // Cria uma instancia do GitManager
        GitManager gitManager = new GitManager();

        // Mensagem do commit
        String commitMessage = "Teste 1 de commit automático";

        // Chama o commitAndPush
        gitManager.commitAndPush(commitMessage);

        // Feedback no console
        System.out.println("Processo finalizado!");


    }




    }

