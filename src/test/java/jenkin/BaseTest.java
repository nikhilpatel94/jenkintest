package jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	@Test
	public void pract() {
		 
		 String b = System.getProperty("bro");
		 String u = System.getProperty("ur");
		 
		 if(b.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			 
	 }
		 else if (b.equalsIgnoreCase("edge")){
			 driver=new EdgeDriver();
		 
	 }
		driver.get(u);
	}

}
