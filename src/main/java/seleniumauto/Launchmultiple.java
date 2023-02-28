package seleniumauto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchmultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		driver.get("https://www.gmail.com/");
		//EdgeDriver drive=new EdgeDriver();
		//drive.get("https://www.gmail.com/");

	}

}
