package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	static String browserName;
	public static WebDriver driver;
	
	public static WebDriver initializeDriver()
	{
		try {
			browserName = FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getUrl(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getUrl(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getUrl(1, 0));
				driver.manage().window().maximize();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		return driver;
	}
	
	public static String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public WebElement addExplicitWait(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
