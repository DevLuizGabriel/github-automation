package br.com.githubauto;

//Detecta quais arquivos foram adicionados ou modificados na pasta local.

public class FileWatcher {

    private String watchPath;  // pasta que será monitorada

    public FileWatcher() {
        // caminho padrão ou vindo de Config
    }

    public void watch() {
        // lógica para detectar novos arquivos
    }

    private boolean isDuplicate(File file) {
        // verifica se o arquivo já foi enviado
        return false;
    }


}
