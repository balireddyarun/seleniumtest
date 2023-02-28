package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement TF=driver.findElement(By.id("twotabsearchtextbox"));
		TF.sendKeys("clothes");
		Thread.sleep(3000);
		TF.clear();
		Thread.sleep(1000);
		TF.sendKeys("watch");
		driver.findElement(By.id("nav-search-submit-button")).click();		
		

	}

}
