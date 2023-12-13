package com.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Queue_page {
	private WebDriver driver;
	
	//Object repositiories or Locators
	
	By QueueGetStartBtn = By.xpath("//body/div/div[5]/div/div/a");
	By ImplOfQueuInPythonLnk = By.linkText("Implementation of Queue in Python");
	By ImpleUsngCollectionsLnk = By.linkText("Implementation using collections.deque");
	By QueueOprationsLnk = By.linkText("Queue Operations");
	By PracticeQuesLink = By.linkText("Practice Questions");
	
	//Constructor
	
	public Queue_page(WebDriver driver) {
		this.driver = driver;
		
	}
	//Page Actions
	
	public void QueuePgGetStartBtn() {
		driver.findElement(QueueGetStartBtn).click();
	}
	public String QueuePgTitle() {
		return driver.getTitle();
	}
	public void ImpleOfQueueInPython() {
		driver.findElement(ImplOfQueuInPythonLnk).click();
	}
	public void goBack() {
		driver.navigate().back();
	}
	public void ImplemeUsngCollectionsLink() {
		driver.findElement(ImpleUsngCollectionsLnk).click();
	}
	public void QueueOprationsLink() {
		driver.findElement(QueueOprationsLnk).click();
	}
	public void PracticeQuesLink() {
		driver.findElement(PracticeQuesLink).click();
	}
	
	

}
