package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic.Open_close_browser;
import POM.Loginpage;
import POM.Taskpage;
import POM.TimeTrackpage;

public class Test_create_task extends Open_close_browser
{
	@Test
	public void create_task() throws Exception
	{
	Loginpage l=new Loginpage(driver);
	l.username();
	l.password();
	l.loginbutton();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	String title=driver.getTitle();
	System.out.println(title);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Enter Time"));
	TimeTrackpage t=new TimeTrackpage(driver);
	t.Tasks();
	Taskpage ts=new Taskpage(driver);
	ts.Addnewtask();
	ts.Createnewtask();
	ts.Selectcustomer();
	ts.Customer();
	//ts.Selectproject();
	//ts.Project();
	ts.Taskname();
	ts.createtaskbutton();
}
}