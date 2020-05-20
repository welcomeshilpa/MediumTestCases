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


public class AdminEditCategoryPOM {
		
	
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
	        WebElement menu1 =driver.findElement(By.xpath("//tr[1]//td[4]//a[1]//i[1]"));
	        actions.moveToElement(menu1);
	        actions.click().build().perform();
	        
	        CategoryEditItemsPOM.editMegaTagTitle(driver).clear();
	        CategoryEditItemsPOM.editMegaTagTitle(driver).sendKeys("Accessories only");
	        CategoryEditItemsPOM.editMegaTitleDesc(driver).sendKeys("Ornaments for Ladies only");
	        CategoryEditItemsPOM.displayDataTab(driver).click();
	        CategoryEditItemsPOM.displayDesignTab(driver).click();
	        CategoryEditItemsPOM.saveBtn(driver).click();
			WebElement validate = driver.findElement(By.xpath("//div[@class='alert alert-success'][contains(text(),'You have modified categories!')]"));
			 String act = validate.getText();
		      String exp = "You have modified categories!";
		     
		}
		
		catch (Exception e) {
			
			System.out.println("Test Message");

		}
	
	}
}
