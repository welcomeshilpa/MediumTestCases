package com.training.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class AdminAddCategoryPOM {
		
	
	public static void execute(WebDriver driver) throws IOException {
		
		try {

			CategoryAddItemPOM.adminID(driver).sendKeys("admin");
			CategoryAddItemPOM.adminPwd(driver).sendKeys("admin@123");
			CategoryAddItemPOM.loginbutton(driver).click();
			Thread.sleep(3000);
			//Menu
	        WebElement mainMenu =driver.findElement(By.xpath("//i[@class='fa fa-tags fw']"));
	        //create object 'action' of and Actions class
	        Actions actions = new Actions(driver);
	        //To mouse over on mainMenu
	        actions.moveToElement(mainMenu);
	        
	        //subMenu
	        WebElement subMenu =driver.findElement(By.xpath("//a[contains(text(),'Categories')]"));
	        //To mouse over on subMenu
	        actions.moveToElement(subMenu);
	        //build() method is used to compile all the actions into a single step 
	        actions.click().build().perform();
	        //driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
	        CategoryAddItemPOM.addCategory(driver).click();
			CategoryAddItemPOM.addCategoryname(driver).sendKeys("ORNAMENTS1");
			CategoryAddItemPOM.addDescription(driver).sendKeys("Ornaments for Ladies only");
			CategoryAddItemPOM.addMegaTagTitle(driver).sendKeys("ORNAMENTS1");
			CategoryAddItemPOM.addMegaTitleDesc(driver).sendKeys("Ornaments for Ladies only");
			CategoryAddItemPOM.displayDataTab(driver).click();
			CategoryAddItemPOM.displayDesignTab(driver).click();
			CategoryAddItemPOM.saveBtn(driver).click();
			WebElement validate = driver.findElement(By.xpath("//div[@class='alert alert-success'][contains(text(),'You have modified categories!')]"));
			 String act = validate.getText();
		      String exp = "You have modified categories!";
		     
		}
		
		catch (Exception e) {
			
			System.out.println("Test Message");

		}
	
	}
}
