package com.definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	
	@Before
	
	public void beforeExecution() {
		webdriverlaunch("Chrome");
		
		

	}
	
	@After
	
	public void afterExecution() throws IOException {
		
		
		TakesScreenshot tc =(TakesScreenshot)driver;
		
		File scSrc = tc.getScreenshotAs(OutputType.FILE);
		File scDes= new File("src\\test\\resources\\ScreenShot\\adactin.png");
		FileUtils.copyFile(scSrc, scDes);
		
		quit();

	}
	
	
	

}
