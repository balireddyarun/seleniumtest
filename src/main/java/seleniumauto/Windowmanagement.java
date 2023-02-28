package seleniumauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowmanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
	}

}
