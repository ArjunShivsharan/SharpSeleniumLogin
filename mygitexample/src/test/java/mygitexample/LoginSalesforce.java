package mygitexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesforce {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PracticeWorkSpace\\mygitexample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharpitech.in/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
	}

}
