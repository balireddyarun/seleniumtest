package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin=driver.findElement(By.className("accountInner"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("arun");
		driver.findElement(By.className("sd-icon-delete-sign")).click();
		driver.switchTo().defaultContent();

		

	}

}
