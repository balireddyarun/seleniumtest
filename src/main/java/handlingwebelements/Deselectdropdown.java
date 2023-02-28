package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		//s.selectByVisibleText(null);
		s.selectByIndex(2);
		s.selectByValue("299");
		if(s.isMultiple()) {
			//s.deselectByVisibleText(null);
			Thread.sleep(2000);
			s.deselectByIndex(2);
			Thread.sleep(3000);
			s.deselectByValue("299");
			//s.deselectAll();
		}
		else
		{
			System.out.println("single select");
		}

	}

}
