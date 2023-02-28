package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			System.out.println("multi select");
		}
		else
		{
			System.out.println("single select");
		}
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("search-alias=automotive-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
	}

}
