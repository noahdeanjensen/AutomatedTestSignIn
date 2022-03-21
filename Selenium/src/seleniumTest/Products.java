package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;



import org.testng.annotations.*;
public class Products {
	
	WebDriver driver;
    @Test
	public void launchbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","/Users/noahjensen/Desktop/Installers");
			driver = new SafariDriver();
			
			Thread.sleep(5000);
			
			driver.get("https://www.demoblaze.com");
			driver.findElement(By.id("login2")).click();
			
			Thread.sleep(5000);
			
			
			usernamePassword();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	public void usernamePassword() {
		driver.findElement(By.id("loginusername")).sendKeys("nj");

		driver.findElement(By.id("loginpassword")).sendKeys("nj");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2] ")).click();
	}
	public static void main(String[] args) {
	Products obj = new Products();
	obj.launchbrowser();

	}

}
