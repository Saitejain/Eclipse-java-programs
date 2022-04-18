package projectt1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Datpro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  Properties prop = new Properties();
  FileInputStream fis = new FileInputStream("C:\\Users\\saite\\eclipse-workspace\\AutomationTestings\\src\\projectt1\\data1.properties");
 // FileOutputStream fos = new FileOutputStream("C:\\Users\\saite\\eclipse-workspace\\AutomationTestings\\src\\projectt1\\data1.properties");
  prop.load(fis);
  System.out.println(prop.getProperty("browser"));
  System.out.println(prop.getProperty("url"));
  prop.setProperty("url", "https://saitejagt.com");
  System.out.println(prop.getProperty("url"));
 // prop.store(fos, null);
	}

}
