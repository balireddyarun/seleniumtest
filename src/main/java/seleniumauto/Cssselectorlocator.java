package seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("arun");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button.selected")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
