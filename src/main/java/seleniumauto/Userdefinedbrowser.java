package seleniumauto;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Userdefinedbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=null;
		EdgeDriver drive=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser");
		String browser=sc.next();
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		else if(browser.equals("edge"))
		drive=new EdgeDriver();
		else
			System.out.println("enter valid browser");
		

	}

}
