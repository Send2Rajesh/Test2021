package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public static WebDriver driver;
	
 public static WebDriver browerlaunch() {
	// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tester-001\\eclipse-workspace\\FB\\src\\test\\resource\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
}
 public static void geturl(String url) {
	// TODO Auto-generated method stub
driver.get(url);
}
}
