#language: pt
Funcionalidade: Menu

  @menu
  Esquema do Cenário: Acessar a tela de <menu> através do menu
    Dado que eu estou na tela inicial do Blog da Ene Soluções
    Quando eu clico no menu <menu>
    Então o site deve me direcionar para <tela>

    Exemplos:
      | menu        | tela                                              |
      | "Serviços"  | "a tela de Serviços"                              |
      | "Vagas"     | "a página de vagas de emprego na Ene Soluções"    |
      | "Contato"   | "o formulário de contato da Ene Soluções"         |
      | "Contratar" | "o formulário de contratação de serviços da Ene" |
