package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Open_close_browser 
{
	public WebDriver driver;
@BeforeMethod
public void open()
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");
}
/*@AfterMethod
public void close()
{
	driver.quit();
}*/
}
