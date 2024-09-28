package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class StoresInfoTest {
	
	WebDriver driver;
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test
	public void StoresInfo() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.grabon.in/stores/");
}
}
