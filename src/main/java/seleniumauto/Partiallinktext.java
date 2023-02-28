package seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallinktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Return")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
