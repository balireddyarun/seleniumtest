package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkifoptionisselected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		s.selectByIndex(5);
		if(s.getFirstSelectedOption().getText().contains("Books"))
		System.out.println("selected");
		else
			System.out.println("not selected");
		

	}
}
