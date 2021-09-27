package com.mindtree.ReusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection {
	public static  WebDriver driver;
	public static Properties prop;
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis=new FileInputStream("src/main/java/com/mindtree/utilities/data.properties");
		prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "drivers//firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("MSEdge")) {
			System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
