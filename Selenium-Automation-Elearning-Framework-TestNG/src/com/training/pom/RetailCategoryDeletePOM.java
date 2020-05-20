package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class RetailCategoryDeletePOM {

	public static WebElement element;
	
	public static WebElement adminID(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='input-username']"));
		return element;
	}

	public static WebElement adminPwd(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='input-password']"));
		return element;
	}

	public static WebElement loginbutton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		return element;
	}

	public static WebElement checkboxSelect(WebDriver driver) { 
	element = driver.findElement(By.xpath("//tbody//tr[1]//td[1]//input[1]")); 
	 return element;
	 }
	 
	 public static WebElement deleteBtn(WebDriver driver)
		{
			element = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
			return element;
		}
	 
	 public static void alertBtn(WebDriver driver)
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	
		
	 
}
