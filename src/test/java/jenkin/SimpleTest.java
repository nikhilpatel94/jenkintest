package jenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
	WebDriver driver;
	
	@Test
	public void simple() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}

}
