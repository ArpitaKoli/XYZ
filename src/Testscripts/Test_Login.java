package Testscripts;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic.Open_close_browser;
import POM.Loginpage;



public class Test_Login extends Open_close_browser
{
@Test
public void login() throws Exception
{
	Loginpage l=new Loginpage(driver);
	l.username();
	l.password();
	l.loginbutton();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Enter Time"));
	
}
}
