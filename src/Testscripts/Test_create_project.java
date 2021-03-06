package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic.Open_close_browser;
import POM.Loginpage;
import POM.Taskpage;
import POM.TimeTrackpage;

public class Test_create_project extends Open_close_browser
{
	@Test
	public void create_project() throws Exception
	{
	Loginpage l=new Loginpage(driver);
	l.username();
	l.password();
	l.loginbutton();
	WebDriverWait wait=new WebDriverWait(driver, 40);
	WebElement tas=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='TASKS']")));
	TimeTrackpage t1=new TimeTrackpage(driver);
	t1.Tasks();
	Taskpage ts=new Taskpage(driver);
	ts.Addnew();
	ts.Newproject();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@tabindex,'1')]")));
	ts.Enterprojectname();
	ts.Custom();
	ts.Projectdesc();
	ts.Createprojectbutton();
}
}
