package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class CategoryAddItemPOM {

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

	public static WebElement addCategory(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		return element;
	}

	public static WebElement addCategoryname(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='input-name1']"));
		return element;
	}

	public static WebElement addDescription(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='note-editable panel-body']"));
		return element;
	}

	public static WebElement addMegaTagTitle(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='input-meta-title1']"));
		return element;
	}

	public static WebElement addMegaTitleDesc(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='input-meta-description1']"));
		return element;
	}

	public static WebElement displayDataTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Data')]"));
		return element;
	}

	public static WebElement displayDesignTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Design')]"));
		return element;
	}

	public static WebElement saveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='fa fa-save']"));
		return element;
	}

	 
}
