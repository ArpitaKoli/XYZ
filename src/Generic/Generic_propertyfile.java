package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Generic_propertyfile 
{
	public String fetch(String key) throws Exception
	{	
	Properties p=new Properties();
	p.load(new FileInputStream("./data.properties"));
	String s=p.getProperty(key);
	return s;
	}
}
