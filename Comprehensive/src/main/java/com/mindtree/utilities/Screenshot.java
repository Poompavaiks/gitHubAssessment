package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.BrowserSelection;


public class Screenshot {
	BrowserSelection b=new BrowserSelection();
	WebDriver driver = BrowserSelection.driver;
	


public void getScreenshot(String result) throws IOException {
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("Screenshots\\"+result+"screenshot.png"));
	}
}