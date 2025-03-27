package baseclasses;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;

public class BaseClass {

public static Map<String, String> mapAANumber = new HashMap<String, String>();
public static Map<String, String> pannumberMap = new HashMap<String, String>();
	public static WebDriver driver;
	public void initializeBrowser() throws IOException {
		/* Chrome Browser */
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.162:9696/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	}


	


