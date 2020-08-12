package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic.Open_close_browser;
import POM.Loginpage;
import POM.Taskpage;
import POM.TimeTrackpage;


public class Test_create_customer extends Open_close_browser
{
@Test
	public void create_customer() throws Exception
	{
	Loginpage l=new Loginpage(driver);
	l.username();
	l.password();
	l.loginbutton();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Enter Time"));
	TimeTrackpage t=new TimeTrackpage(driver);
	t.Tasks();
	Taskpage ts=new Taskpage(driver);
	ts.Addnew();
	ts.Newcustomer();
	ts.Customername();
	ts.customer_description();
	ts.Dropdown();
	ts.Option();
	ts.createcustomerbutton();
	}
}
