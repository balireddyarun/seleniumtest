package seleniumauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamelocatoronebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement Searchebay=driver.findElement(By.name("_nkw"));
		Searchebay.sendKeys("Smart watch");
		driver.findElement(By.className("btn")).click();
		driver.close();

	}

}
