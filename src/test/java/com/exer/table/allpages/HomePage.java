package com.exer.table.allpages;


import java.text.ParseException;

import org.openqa.selenium.By;

import com.exer.table.pages.basic.Page;

public class HomePage extends Page {

	private static HomePage homePage = null;

	/**
	 * This method is used to get page.
	 * 
	 * @return
	 */
	public static HomePage getPage() {

		if (homePage == null) {

			homePage = new HomePage();
		}

		return homePage;
	}
	/*
	 *This is to verify the page title. 
	 *
	 **/
	
	public boolean verifypagetitle(){
		if(pageTitle.equalsIgnoreCase(GetTile())){
			return true;
		}
		return false;
		
	}
	public boolean validateValues() throws ParseException{
		for(int i=0;i<textValues.length;i++){
		
			format(driver.findElement(By.id(textValues[i])).getText());
			
			if(format(driver.findElement(By.id(textValues[i])).getText())>0){
				return true;
			}
			}
		
		return false;
	}
	
	public int verifyValueCount(){
		
		for(int i=0;i<textValues.length;i++){
		if(driver.findElement(By.id(textValues[i])).isDisplayed()){
			count++;
		}
		}
		return count;
	}
	
public boolean validatetotal() throws ParseException{
		
		for(int i=0;i<textValues.length;i++){
			Sum=Sum+format(driver.findElement(By.id(textValues[i])).getText());
	}
		
if(Sum==format(driver.findElement(By.id(totalBalance)).getText())){
	return true;
}
return false;
}

public boolean currrencyValidator() throws ParseException{
	
	for(int i=0;i<textValues.length;i++){
		if("$".equals(driver.findElement(By.id(textValues[i])).getText().charAt(0))){
			if("$".equals(driver.findElement(By.id(totalBalance)).getText().charAt(0))){
				return true;
		}else{
			return false;
		}
		
}
	
	}
	
return false;
}

}
