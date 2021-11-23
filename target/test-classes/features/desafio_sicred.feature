#Author: wesley.avilla@hotmail.com
 @desafio
Feature:  Preencher cadastro no site grocerycrud
  Como usuario quero criar e deletar um cadastro
    
  @desafio1
  Scenario: adicionando cliente
    Given que entre no site da Grocerycrud "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    When modificar a select version para bootstrap v4 theme 
    And clico no botao add customer 
    And preencho o formulario com as informacoes "Teste Sicredi", "Teste", "Wesley da Avilla Bastos", "51 9999-9999", "Av Assis Brasil, 3970", "Torre D", "Porto Alegre", "RS", "91000-000", "Brasil", "200", 
    And clico em save 
    Then valido a mensagem de sucesso "Your data has been successfully stored into the database. Edit Customer or Go back to list"   
  @desafio2
   Scenario: adicionando cliente
    When que acesse o link go back to list
    And preencher campo search name "Teste Sicredi"
    And selecionar o cadastro no checkbox e delete
    And valido a mensagem no pop-up "Are you sure that you want to delete this 1 item?"
    And clicar no delete do pop-up e valido mensagem "Your data has been successfully deleted from the database."
    Then fecho browser