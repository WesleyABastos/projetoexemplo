package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By theme4 = By.id("switch-version-select");
	public By bootstraptheme4 = By.xpath("//*[@id=\"switch-version-select\"]/option[2]");
	public By addc = By.xpath("//div[@class=\"floatL t5\"]/a");
	public By names = By.id("field-customerName");
	public By lastn = By.id("field-contactLastName");
	public By yourname = By.id("field-contactFirstName");
	public By phone = By.id("field-phone");
	public By address1 = By.id("field-addressLine1");
	public By address2 = By.id("field-addressLine2");
	public By city = By.id("field-city");
	public By state = By.id("field-state");
	public By postalcode = By.id("field-postalCode");
	public By country = By.id("field-country");
	public By employeer = By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/div");
    public By fixter = By.xpath("//div[@class=\"chosen-search\"]/input");
    public By fixterc = By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/span");
   	public By credit = By.name("creditLimit");
	public By save = By.id("form-button-save");
	private By sucess = By.id("report-success");		
	public By goback = By.xpath("//*[@id=\"report-success\"]/p/a[2]");
	public By searchname = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input");
	public By checkbox = By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[1]");	
	public By deletebuton = By.xpath("(//div)[18]/a");
	public By validopopup = By.xpath("(//p)[3]");
          
	public By deletepopup = By.xpath("//button[@data-target=\"/v1.x/demo/bootstrap_theme_v4/delete_multiple\"]");

    public By sucessdelete = By.xpath("//p[contains(.,'Your data has been successfully deleted from the database')]");

	public By getSucess() {
		return sucess;
	}

    
}
