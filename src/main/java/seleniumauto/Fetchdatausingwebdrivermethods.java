package seleniumauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdatausingwebdrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://icc-cricket.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(title+"\n"+url);
		String SourceCode= driver.getPageSource();
		

	}

}
