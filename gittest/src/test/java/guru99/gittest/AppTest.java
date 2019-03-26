package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

protected WebDriver driver;


    
public void tutorials() {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.facebook.com");
	driver.manage().window().maximize();
	String atitle = driver.getTitle();
	System.out.println(atitle);
	
	driver.close();
			

}
	
    
}
