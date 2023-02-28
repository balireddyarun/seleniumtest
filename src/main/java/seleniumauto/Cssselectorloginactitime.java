package seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorloginactitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input#username")).sendKeys("arun");
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("123");
		driver.findElement(By.xpath("//div[text()='login']")).click();

	}

}
