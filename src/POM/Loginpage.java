package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Generic_Excelsheet_fetchdata;
import Generic.Generic_propertyfile;

public class Loginpage 
{
@FindBy(id="username")
private WebElement UN;
@FindBy(name="pwd")
private WebElement PW;
@FindBy(xpath="//div[.='Login ']")
private WebElement log;
public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
Generic_propertyfile o=new Generic_propertyfile();
public void username() throws Exception
{
	String user=o.fetch("username");
	UN.sendKeys(user);
}

public void password() throws Exception
{ 
	String pass=o.fetch("password");
	PW.sendKeys(pass);
}
public void loginbutton()
{
	log.click();
}
}
