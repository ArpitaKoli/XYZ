package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excelsheet_fetchdata 
{
public String fetch(int i,int j) throws Exception
{	
FileInputStream fis=new FileInputStream("./data.xlsx");
Workbook excel=WorkbookFactory.create(fis);
Sheet sh=excel.getSheet("Sheet1");
Row r=sh.getRow(i);
Cell c=r.getCell(j);
String d=c.toString();
}
}
