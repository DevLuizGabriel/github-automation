#  GitAuto — Automação de Git com Java + JGit

Uma ferramenta simples e modular desenvolvida em **Java**, usando **JGit**, para automatizar operações Git como *add*, *commit* e *push*.  
Projeto em desenvolvimento — criado para estudo e expansão contínua.

---

## 🧠 Motivação

Com menos de 3 meses estudando Java, iniciei este projeto pois senti vontade real de automatizar uma tarefa utilizando a linguagem. para praticar e aprender como funciona a integração entre código e automação de versionamento.

Criar minha própria automação Git me ajudou a entender, na prática:

- como o Git funciona internamente  
- como executar operações GIT através do Jgit no java
- como organizar o código em camadas  
- como aplicar boas práticas de segurança  

Este projeto será expandido conforme eu evoluir nos estudos.

---

## 📦 Funcionalidades

- Automatiza:
  - `git add .`
  - `git commit -m "..."`
  - `git push`
- Utiliza **JGit**, permitindo controlar o Git sem terminal
- Estrutura modular:
  - `Config` → carrega configs e variáveis de ambiente  
  - `GitManager` → executa operações Git  
  - `Main` → ponto de entrada
- **Segurança real:** tokens do GitHub ficam nas variáveis de ambiente
- Projeto preparado para expansão

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **JGit** (biblioteca que implementa operaões Git)
- **Variáveis de ambiente**
- **Arquivo `.env`**  
- **Maven**

---

## 🚀 Como usar

### 1️⃣ Clone este repositório
```bash
git clone https://github.com/DevLuizGabriel/github-automation.git

### 2️⃣ Configure suas variáveis de ambiente

No seu sistema operacional:

GITHUB_USER=seu_usuario
GITHUB_TOKEN=seu token

! Por segurança não coloque no .env seu usuário e token.

### 3️⃣ Crie o arquivo .env na raiz do projeto

REPO_PATH=C:/caminho/para/seu/repositorio

### 4️⃣ Execute o projeto
Na IDE ou terminal:
java Main

O programa realizará automaticamente:

git add .

git commit -m "mensagem"

git push

## 🧩 Estrutura do Projeto
github-automation/
├── src/
│ └── main/
│ └── java/
│ └── br/com/githubauto/
│ ├── Config.java
│ ├── ConsoleLogger.java
│ ├── FileWatcher.java
│ ├── GitManager.java
│ └── Main.java
├── .env
└── pom.xml

### 🔐 Segurança
O projeto utiliza System.getenv() para acessar:

GITHUB_USER

GITHUB_TOKEN

Assim, seus dados:

- não aparecem no código
- não ficam no .env
- não vão para o repositório
- não vazam para ninguém

Mesmo que clonem este repositório, não conseguem utilizar seu token.
