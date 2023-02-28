package seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("arunk");
		driver.findElement(By.className("_9npi")).sendKeys("123");
		driver.findElement(By.className("selected")).click();
		driver.close();
		
		
		
		

	}

}
