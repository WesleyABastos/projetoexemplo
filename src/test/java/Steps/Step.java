package Steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.sicredi.MetodosSicredi;
import pages.Browsers;

public class Step {


	MetodosSicredi metodo = new MetodosSicredi();
	Browsers browser = new Browsers();
	Elementos el = new Elementos();

	@Given("que entre no site da Grocerycrud {string}")
	public void que_entre_no_site_da_grocerycrud(String string) {
		browser.abrirNavegador(string);
	}

	@When("modificar a select version para bootstrap v4 theme")
	public void modificar_a_select_version_para_bootstrap_v4_theme() {
		metodo.clicar(el.theme4);
		metodo.clicar(el.bootstraptheme4);
	}

	@When("clico no botao add customer")
	public void clico_no_botao_add_customer() {
		metodo.clicar(el.addc);
	}

	@When("preencho o formulario com as informacoes {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},")
	public void preencho_o_formulario_com_as_informacoes(String name, String lastname, String myname, String phone,
			String ad1, String ad2, String city, String state, String postal, String country, String credit) throws InterruptedException {
		metodo.escrever(el.names, name);
		metodo.escrever(el.lastn, lastname);
		metodo.escrever(el.yourname, myname);
		metodo.escrever(el.phone, phone);
		metodo.escrever(el.address1, ad1);
		metodo.escrever(el.address2, ad2);
		metodo.escrever(el.city, city);
		metodo.escrever(el.state, state);
		metodo.escrever(el.postalcode, postal);
		metodo.escrever(el.country, country);
		metodo.test();
		metodo.escrever(el.credit, credit);
	}

	@When("clico em save")
	public void clico_em_save() throws InterruptedException {
		metodo.clicar(el.save);
		Thread.sleep(1000);
	}

	@Then("valido a mensagem de sucesso {string}")
	public void valido_a_mensagem_de_sucesso(String texto) throws InterruptedException {
		Thread.sleep(1000);
		metodo.validarTexto(el.getSucess(),texto);
	}
	@When("que acesse o link go back to list")
	public void que_acesse_o_link_go_back_to_list() {
		metodo.clicar(el.goback);
	}
	@When("preencher campo search name {string}")
	public void preencher_campo_search_name(String teste) throws InterruptedException {
		metodo.escrever(el.searchname, teste);
		Thread.sleep(1000);
	}
	@When("selecionar o cadastro no checkbox e delete")
	public void selecionar_o_cadastro_no_checkbox_e_delete() throws InterruptedException {
		metodo.clicar(el.checkbox);
		metodo.clicar(el.deletebuton);
		//metodo.screenShot("clique no box para deletar");
		Thread.sleep(500);
	}
	@When("valido a mensagem no pop-up {string}")
	public void valido_a_mensagem_no_pop_up(String popup) throws InterruptedException {
		metodo.validarTexto(el.validopopup, popup);
	}
	@When("clicar no delete do pop-up e valido mensagem {string}")
	public void clicar_no_delete_do_pop_up_e_valido_mensagem(String texto2) throws InterruptedException {
		//metodo.aguardarElementoClicavel(5000, el.deletepopup);
				metodo.clicar(el.deletepopup);
				Thread.sleep(2000);
				metodo.validarTexto(el.sucessdelete, texto2);
				metodo.screenShot("cadastro excluido com sucesso");
				
	}

@Then("fecho browser")
public void fecho_browser() {
	metodo.fechar();
}
}