import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drinkprime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://drinkprime.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='water_purifier_product']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		WebElement element=driver.findElement(By.id("fname"));
		element.sendKeys("arun");
		Thread.sleep(1000);
		WebElement phno=driver.findElement(By.id("pnumber"));
		phno.sendKeys("1122556635");
		WebElement cty=driver.findElement(By.id("country"));
		cty.sendKeys("bangalore");
		driver.findElement(By.className("request-btn submit")).click();
		
	}

}
