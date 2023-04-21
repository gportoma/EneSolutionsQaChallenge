#language: pt
Funcionalidade: Busca

  @busca
  Cenário: Exibir resultados de busca relacionados à palavra-chave pesquisada
    Dado que eu estou na tela inicial do Blog da Ene Soluções
    Quando eu faço uma pesquisa pela palavra "segurança"
    Então o site deve exibir os posts relacionados ao assunto pesquisado

  @busca
  Cenário: Exibir mensagem de nenhum resultado encontrado para uma palavra-chave inexistente
    Dado que eu estou na tela inicial do Blog da Ene Soluções
    Quando eu faço uma pesquisa pela palavra "asdzxc"
    Então o site deve exibir a mensagem "Nenhum resultado encontrado" indicando que não há posts relacionados à palavra pesquisada

  @busca
  Cenário: Exibir mensagem de nenhum resultado encontrado para pesquisa vazia
    Dado que eu estou na tela inicial do Blog da Ene Soluções
    Quando eu faço uma pesquisa vazia
    Então o site deve exibir a mensagem "Nenhum resultado encontrado" indicando que nenhuma palavra-chave foi inserida na pesquisa
