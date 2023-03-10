package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Validateamazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("carrom");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Actions a=new Actions(driver);
		WebElement state=driver.findElement(By.id("icp-nav-flyout"));
		WebElement select=driver.findElement(By.className("icp-mkt-change-lnk"));
		a.moveToElement(state).moveToElement(select).click().perform();
	}

}
