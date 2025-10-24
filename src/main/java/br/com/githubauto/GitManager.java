package br.com.githubauto;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import java.io.File;

// Gerencia todas as operações de Git usando a biblioteca JGit.

public class GitManager {
    private static final String REPO_PATH = "D:/Projetos/github-automation"; // caminho para a pasta do repositório local (deve conter .git)
    private static final String USERNAME = Config.get("GITHUB_USER"); // seu usuário GitHub
    private static final String TOKEN = Config.get("GITHUB_TOKEN"); // token do GitHub


    // lógica para adicionar, commitar e dar push
    public void commitAndPush(String message) {
        try {
            Git git = Git.open(new File(REPO_PATH));
            git.add().addFilepattern(".").call();
            git.commit().setMessage(message).call();

            git.push()
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(USERNAME, TOKEN)).call();
            System.out.println("Commite e push realizados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar commit/push:" + e.getMessage());
            e.printStackTrace();
             }
        }
    }
