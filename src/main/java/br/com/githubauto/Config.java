package br.com.githubauto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


//Armazena constantes e informações sensíveis que o sistema precisa para funcionar.

public class Config {
    private static Properties props = new Properties();

    static{
        try {
            FileInputStream fis = new FileInputStream("github-automation/.env"); // caminho do arquivo .env
            props.load(fis);

        } catch (IOException e) {
        System.out.println("Erro ao carregar arquivo de configuração: " + e.getMessage());
    }
}

public static String get(String key) {
    return props.getProperty(key);
}

}