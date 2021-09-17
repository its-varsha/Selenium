package seleniumdemo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//a[@href='#'and @id='welcome']")).click();
	
		// Explicit wait
		WebDriverWait Mywait=new WebDriverWait(driver,10);
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
		driver.close();

	}

}
