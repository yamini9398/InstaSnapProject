package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	@Test
	public void verify() throws IOException {
		// configure the broswer
		WebDriverManager.chromedriver().setup();
		//launch broswer
		WebDriver driver=new ChromeDriver();
		//navigate to the browser
		driver.get("https://www.selenium.dev/");
		WorkbookFactory.create(false);
	}
	
	

}
