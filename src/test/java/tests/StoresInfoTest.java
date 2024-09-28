package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class StoresInfoTest {
	
	WebDriver driver;
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test
	public void StoresInfo() throws IOException {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.grabon.in/stores/");
	
	File scrshtFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scrshtFile, new File(System.getProperty("user.dir")+"//screenshots//image1.png"));
}
}
