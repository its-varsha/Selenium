package seleniumdemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		/*WebElement radio1 = driver.findElement(By.id("gender-male"));							
        WebElement radio2 = driver.findElement(By.id("gender-female"));
        radio1.click();
        radio2.click();*/
        
       // WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		driver.findElement(By.xpath("//input[@value='M']")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
        driver.findElement(By.id("LastName")).sendKeys("H");
        driver.findElement(By.id("Email")).sendKeys("abhi111@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("ABHISHEK");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("ABHISHEK");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
	
		driver.close();

        
        
        
	}

}
