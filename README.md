# Desafio QA Ene Soluções

Este projeto foi desenvolvido em Java, utilizando as ferramentas Maven, Selenium e Cucumber, com o objetivo de automatizar testes de funcionalidades de menus e buscas em uma aplicação web.

Utilizamos o Maven como gerenciador de dependências e construção de projetos, o Selenium para interagir com os elementos da página web, e o Cucumber com Gherkin como ferramenta de suporte à escrita de testes BDD (Behavior Driven Development).

Com a automação dos testes de menus e buscas, é possível garantir a integridade e o correto funcionamento dessas funcionalidades, além de reduzir o tempo e o custo de testes manuais.

# Requisitos
Para rodar o projeto, você vai precisar das sequintes ferramentas:

1. Java JDK 8 ou superior + Maven
   1.  Instalação: https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
   2. configurar variaveis de ambiente Windows/Mac/Linux: https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26
2. WebDriver para o navegador Google Chrome (baixar de acordo com sua versão do navegador): https://chromedriver.chromium.org/downloads

# Estrutura do Projeto
Eu utilizei o Maven para gerenciar as dependências do meu projeto de automação em Java e organizei a estrutura do projeto utilizando o POM (Project Object Model). Também utilizei o conceito de Page Object Model para separar o código de teste do código da interface gráfica, tornando o meu código mais fácil de manter e reutilizar.

```
3 - automation/
├── src/
│   ├── main/
│   │   └── resources/
│   │       ├── Evidencias
│   │       └── webdriver
│   └── test/
│       ├── java/
│       │   ├── core
│       │   ├── page
│       │   ├── runner
│       │   ├── steps
│       │   └── utils
│       └── resources/
│           ├── Busca.feature
│           └── Menu.feature
├── pom.xml
└── README.md
```
### Descrição das classes

- `src/main/resources/Evidencias:` Este diretório é responsável por armazenar as evidências geradas durante a execução dos testes. As evidências podem ser screenshots ou logs que serão úteis para a verificação dos testes executados.
- `src/main/resources/webdriver:` Este diretório é responsável por armazenar o driver do navegador utilizado nos testes. É importante manter o driver em um local específico para facilitar o gerenciamento e a configuração do ambiente de testes.
- `src/test/java/core:` Este diretório contém as classes de configuração do projeto, como a criação do driver, DSL e uma Base Page. Essas classes são responsáveis por definir o comportamento padrão do projeto, bem como a sua configuração inicial.
- `src/test/java/page:` Este diretório contém as classes que representam cada página da aplicação e suas respectivas ações. Essas classes são responsáveis por realizar as ações na página, bem como interagir com seus elementos.
- `src/test/java/runner:` Este diretório contém as classes de execução dos testes. Essas classes são responsáveis por definir a execução dos testes automatizados e podem ser configuradas para executar um ou mais testes.
- `src/test/java/steps:` Este diretório contém as classes que definem o passo-a-passo dos testes, utilizando a sintaxe do Gherkin. Essas classes são responsáveis por definir as ações que serão executadas em cada cenário de teste.
- `src/test/java/utils:` Este diretório contém classes de utilidades, como métodos de screenshot ou outras funções que possam ser úteis para a execução dos testes.
- `src/test/resources:` Este diretório contém os arquivos de teste escritos em Gherkin com o Cucumber. Esses arquivos descrevem os cenários de teste de forma clara e legível, permitindo que os testes sejam escritos em linguagem natural e compreendidos por todos os membros da equipe.

# Como rodar a automação

No terminal clone o projeto:
```
git clone https://github.com/gportoma/EneSolutionsQaChallenge.git
```

Abra o projeto em sua IDE e vá no diretório `src/test/java/runner`:

- Para executar todos os testes selecione a classe `RunAllTest.java` e executa;
- Para executar os testes de Busca selecione a classe `BuscaTest.java` e executa;
- Para executar os testes de Menu selecione a classe `MenuTest.java` e executa;

Após execução você consegue acompanhar os resultados no console e as evidencias dos testes no caminho `src/main/resources/Evidencias`.



