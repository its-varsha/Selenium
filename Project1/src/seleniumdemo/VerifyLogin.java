package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedTitle ="Demo Web Shop. Login";
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("You are on correct page");
			driver.findElement(By.id("Email")).sendKeys("varshasalian16@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("VARSHA16");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.linkText("Log out")).click();
			driver.close();

		}
		else {
			
			System.out.println("You are on wrong page");
			driver.close();
		
		}
		
	}

}
