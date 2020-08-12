package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackpage 
{
@FindBy(xpath="//div[.='TASKS']")
private WebElement task;

@FindBy(xpath="//div[.='TIME-TRACK']")
private WebElement timetrack;

@FindBy(xpath="//div[.='REPORTS']")
private WebElement reports;

@FindBy(xpath="//div[.='USERS'] ")
private WebElement users;

public TimeTrackpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Tasks()
{
	task.click();
}

public void Timetrack()
{
	timetrack.click();
}

public void Users()
{
	users.click();
}

public void Reports()
{
	reports.click();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

