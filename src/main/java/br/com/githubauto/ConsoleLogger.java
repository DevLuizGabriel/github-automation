package br.com.githubauto;

// Mostrar mensagens organizadas para o usuário.

public class ConsoleLogger {

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void error(String message) {
        System.err.println("[ERROR] " + message);
    }

}
