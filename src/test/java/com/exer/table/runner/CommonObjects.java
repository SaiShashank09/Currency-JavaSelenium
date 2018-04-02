package com.exer.table.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.exer.table.pages.basic.Page;

import cucumber.api.Scenario;

public class CommonObjects {

	public static WebDriver driver;
	public static Scenario scenario;
	public static WebDriverWait wait;
	public static String URL="https://www.exercise1.com/values";

	// Run Parameters
	public static String environment;
	public static String browserType;

	// Pages
	public static Page page;

	// Application data
	public static WebElement element;
	public static String pageTitle="ApplicationPageTitile";
	public String[] textValues ={"txt_val_1","txt_val_2","txt_val_4","txt_val_5","txt_val_6"}; 
	public String totalBalance="txt_ttl_val";
	public static int count=0;
	public static int totalValueCount=5;
	public static String formattedString=null;
	public static String formattedSubString=null;
	public static double number;
	public static double Sum;
	public int temp;
	
}
