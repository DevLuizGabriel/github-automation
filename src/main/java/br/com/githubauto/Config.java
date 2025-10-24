package br.com.githubauto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Armazena informações sensíveis do projeto.
public class Config {

    private static final Properties props = new Properties();
    private static final String ENV_FILE = ".env"; // arquivo na raiz do projeto

    static {
        try (FileInputStream fis = new FileInputStream(ENV_FILE)) {
            props.load(fis);
        } catch (IOException e) {
            System.err.println("Não foi possível carregar o arquivo .env: " + ENV_FILE);
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return System.getenv("GITHUB_USER");
    }

    public static String getToken() {
        return System.getenv("GITHUB_TOKEN");
    }

    public static String getRepoPath() {
        return props.getProperty("REPO_PATH");
    }
}