package com.exer.table.pages.basic;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;


import com.exer.table.runner.CommonObjects;

public class Page extends CommonObjects {


	
	public void openApplication() {

		driver.get(URL);
		haltExecution(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	

	/**
	 * This method is used to halt execution
	 * 
	 * @param haltTime
	 */
	public void haltExecution(long haltTime) {

		try {
			Thread.sleep(haltTime);
		} catch (Exception e) {
		}
	}

		
	
	public String GetTile() {
		return driver.getTitle();
		
	}
	
	public double format(String formattedString) throws ParseException{
		
		 
		formattedSubString=formattedString.substring(1, formattedString.length());
		number=(double)NumberFormat.getNumberInstance(java.util.Locale.US).parse(formattedSubString);
		
		return number;
		
	}

	

	

}
