package seleniumauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String pagesourceCode=driver.getPageSource();
		System.out.println(pagesourceCode);
	

	}

}
