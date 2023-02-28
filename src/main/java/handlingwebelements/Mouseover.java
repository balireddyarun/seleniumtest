package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a=new Actions(driver);
		WebElement admin = driver.findElement(By.id("course"));
		WebElement user = driver.findElement(By.partialLinkText("Selenium"));
		WebElement dev = driver.findElement(By.id("add"));
		a.moveToElement(admin).moveToElement(user).click().doubleClick(dev).perform();

	}

}
