package metodos.sicredi;


import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pages.Browsers;

public class MetodosSicredi extends Browsers {

	public void clicar(By elemento) {
		try {
			driver().findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------- erro ao clicar -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void escrever(By elemento, String texto) {
		try {
			driver().findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------- erro ao escrever -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void test() throws InterruptedException {
		Thread.sleep(2000);
		driver().findElement(By.xpath("(//div)[33]/b")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//ul)/li[8]")).click();

	}

	

	public void validarTexto(By elemento, String texto1) {
			String texto2 = driver().findElement(elemento).getText();
			assertEquals(texto1, texto2);
			System.out.println("o texto esperado é "+texto1);
		
	}

	public void screenShot(String nome) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + e.getMessage());
		}
	}

	public void submit(By elemento) {
		try {
			driver().findElement(elemento).submit();
		} catch (Exception e) {
			System.err.println("-------- error ao dar submit -------" + e.getMessage());
		}
	}

	public void fechar() {
		driver().quit();
		
	}
}
