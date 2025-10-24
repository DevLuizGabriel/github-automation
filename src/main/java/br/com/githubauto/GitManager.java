package br.com.githubauto;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import java.io.File;

// Gerencia operações Git usando JGit.
public class GitManager {

    private static final String USERNAME = Config.getUsername();
    private static final String TOKEN = Config.getToken();
    private static final String REPO_PATH = Config.getRepoPath();

    // Adiciona, commita e dá push automaticamente
    public void commitAndPush(String message) {
        try {
            Git git = Git.open(new File(REPO_PATH));

            // Adiciona todos os arquivos
            git.add().addFilepattern(".").call();

            // Cria commit
            git.commit().setMessage(message).call();

            // Push para remoto
            git.push()
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(USERNAME, TOKEN))
                    .call();

            System.out.println("✅ Commit e push realizados com sucesso!");
        } catch (Exception e) {
            System.err.println("❌ Erro ao realizar commit/push: " + e.getMessage());
            e.printStackTrace();
        }
    }
}