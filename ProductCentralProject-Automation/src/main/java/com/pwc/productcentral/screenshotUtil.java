package com.pwc.productcentral;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshotUtil {
	public void getScreenshot() throws IOException{
		
		Date currentdate= new Date();
		String screenshotfilename=currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotFile=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile( screenshotFile, new File(".//screenshot//"+screenshotfilename+ ".png"));
	}

}