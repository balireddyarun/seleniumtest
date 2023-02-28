package Scrollaction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Disabledelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/disabled.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());

	}

}
