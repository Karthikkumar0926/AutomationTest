package com.automationpratice.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}

	public static boolean elementFound(WebElement element) {
	boolean res = false;
	try {
	res = element.isDisplayed();
	} catch (Exception e) {
	e.printStackTrace();
	}
	return res;
	}
	public static void setText(WebElement element, String name) {
	if (name != null && elementFound(element)) {
	element.clear();
	element.sendKeys(name);
	}
	}
	public static void setByJs(WebElement element, String name) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	if (name != null && elementFound(element)) {
	element.clear();
	executor.executeScript("arguments[0].getAttribute('value')",element);
	}
	}
	public static String getAttribute(WebElement element) {
	String name = null;
	if (elementFound(element)) {
	name = element.getAttribute("value");
	}
	return name;
	}
	public static String getText(WebElement element) {
	String name = null;
	if (elementFound(element)) {
	name = element.getText();
	}
	return name;
	}
	public static void click(WebElement element) {
	if (elementFound(element)) {
	 element.click();
	}
	}
	public static void clickbyJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	if (elementFound(element)) {
		executor.executeScript("arguments[0].click();", element);
	}
	}
	
	public static void selectbyvalue(WebElement element, String name) {
		if (name != null && elementFound(element)) {
		Select s= new Select(element);
	s.selectByVisibleText(name);
		}
	
	}

}
