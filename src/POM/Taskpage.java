package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Generic_Excelsheet_fetchdata;
import Generic.Generic_propertyfile;


public class Taskpage 
{
@FindBy (xpath="//div[.='Add New']")
private WebElement addnew;

@FindBy (xpath="//div[.='+ New Customer']")
private WebElement newcustomer;

@FindBy (xpath="//input[@class=\"inputFieldWithPlaceholder\" and @id=\"customerLightBox_nameField\"] ")
private WebElement customername;

@FindBy (xpath="//textarea[@id=\"customerLightBox_descriptionField\" and @class=\"inputFieldWithPlaceholder\"] ")
private WebElement desc;

@FindBy (xpath="//button[@class=\"x-btn-text\"  and @id=\"ext-gen23\"]")
private WebElement dropdown;

@FindBy (xpath="//a[.='Architects Bureau']")
private WebElement option1;

@FindBy (xpath="//span[.='Create Customer']")
private WebElement createbutton;

@FindBy (xpath="//div[.='Add New Task']")
private WebElement addnewtask;

@FindBy (xpath="//div[.='Create new tasks']")
private WebElement createnewtask;

@FindBy (xpath="//em[contains(.,'- Select Customer -')]")
private WebElement selectcustomer;

@FindBy (xpath="//a[contains(.,'arpita')]")
private WebElement customer;

@FindBy (xpath="//button[contains(.,'- Select Project -')]")
private WebElement selectproject;

@FindBy (xpath="//a[contains(.,'Consulting')]")
private WebElement project;

@FindBy (xpath="(//input[@placeholder=\"Enter task name\"])[1]")
private WebElement taskname;

@FindBy (xpath="//span[.='Create Tasks']")
private WebElement createtaskbutton;

@FindBy (xpath="(//div[contains(.,'+ New Project')])[2]")
private WebElement newproject;

@FindBy (xpath="//input[contains(@tabindex,'1')]")
private WebElement enterprojectname;

@FindBy (xpath="//button[contains(.,'-- Please Select Customer to Add Project for  --')]")
private WebElement custom;

@FindBy (xpath="//a[contains(.,'arpita')]")
private WebElement arpitacustomer;

@FindBy (xpath="//textarea[@name='projectDescriptionField']")
private WebElement projectdesc;

@FindBy (xpath="//span[contains(.,'Create Project')]")
private WebElement createprojectbutton;


public Taskpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

Generic_propertyfile o=new Generic_propertyfile();
public void Addnew()
{
	addnew.click();
}
public void Newcustomer()
{
	newcustomer.click();
}
public void Customername() throws Exception
{
	
	String name=o.fetch("customername");
	customername.sendKeys(name);
}
public void customer_description() throws Exception
{  
	String d=o.fetch("customerdesc");
	desc.sendKeys(d);
}
public void Dropdown()
{
	dropdown.click();
}

public void Option()
{
	option1.click();
}
public void createcustomerbutton()
{
	createbutton.click();
}
public void Addnewtask()
{
	addnewtask.click();
}
public void Createnewtask()
{
	createnewtask.click();
}
public void Selectcustomer()
{
	selectcustomer.click();
}
public void Customer()
{
	customer.click();
}
public void Selectproject()
{
	selectproject.click();
}
public void Project()
{
	project.click();
}
public void Taskname() throws Exception
{
	String t=o.fetch("taskname");
	taskname.sendKeys(t);
}
public void createtaskbutton()
{
	createtaskbutton.click();
}
public void Newproject()
{
	newproject.click();
}
public void  Enterprojectname() throws Exception
{
	String p=o.fetch("projectname");
	enterprojectname.sendKeys(p);
}
public void Custom() throws Exception
{
	custom.click();
	Thread.sleep(2000);
	arpitacustomer.click();
}

public void Projectdesc() throws Exception
{
	String pr=o.fetch("projectdesc");
	projectdesc.sendKeys(pr);
}
public void  Createprojectbutton()
{
	 createprojectbutton.click();
}
}
