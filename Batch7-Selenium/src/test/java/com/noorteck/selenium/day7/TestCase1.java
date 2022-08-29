package com.noorteck.selenium.day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestCase1 {

	WebDriver driver;

	public void setUp() {

		String key = "webdriver.chrome.driver";
		String path = ("/Users/jameslopez/Desktop/B7-Selenium/chromedriver");

		System.setProperty(key, path);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

	public void testCase() throws InterruptedException {

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement el = driver.findElement(By.xpath("//*[contains(text(),'right click me')]"));

		Actions action = new Actions(driver);

		action.contextClick(el).build().perform();

		WebElement copy = driver.findElement(By.xpath("//*[text()= 'Copy']"));

		copy.click();

		Alert alert = driver.switchTo().alert();
		String alertTextClick2 = alert.getText();
		System.out.println("Alert Message: " + alertTextClick2);

		Thread.sleep(2000);
		alert.accept();

	}

	public void testCasetwo() throws InterruptedException {

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));

		Actions action = new Actions(driver);

		action.doubleClick(doubleClick).build().perform();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);

		Thread.sleep(2000);
		alert.accept();

	}

	public void testCaseThree() throws InterruptedException {

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement cap1 = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement cap2 = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement cap3 = driver.findElement(By.xpath("//*[@id='box3']"));
		WebElement cap4 = driver.findElement(By.xpath("//*[@id='box4']"));
		WebElement cap5 = driver.findElement(By.xpath("//*[@id='box5']"));
		WebElement cap6 = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement cap7 = driver.findElement(By.xpath("//*[@id='box7']"));

		WebElement cou1 = driver.findElement(By.xpath("//*[@id='box101']"));
		WebElement cou2 = driver.findElement(By.xpath("//*[@id='box102']"));
		WebElement cou3 = driver.findElement(By.xpath("//*[@id='box103']"));
		WebElement cou4 = driver.findElement(By.xpath("//*[@id='box104']"));
		WebElement cou5 = driver.findElement(By.xpath("//*[@id='box105']"));
		WebElement cou6 = driver.findElement(By.xpath("//*[@id='box106']"));
		WebElement cou7 = driver.findElement(By.xpath("//*[@id='box107']"));

		Actions action = new Actions(driver);

		action.dragAndDrop(cap1, cou1).build().perform();

		action.dragAndDrop(cap2, cou2).build().perform();

		action.dragAndDrop(cap3, cou3).build().perform();

		action.dragAndDrop(cap4, cou4).build().perform();

		action.dragAndDrop(cap5, cou5).build().perform();

		action.dragAndDrop(cap6, cou6).build().perform();

		action.dragAndDrop(cap7, cou7).build().perform();

	}

	public void testCaseFour() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		

		WebElement admin = driver.findElement(By.xpath("//*[text()= 'Admin']"));
		WebElement job = driver.findElement(By.xpath("//span[contains(text(),'Job')]"));
		WebElement jobTitles = driver.findElement(By.xpath("//a[contains(text(),'Job Titles')]"));
		WebElement add = driver.findElement(By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']"));
		

		Actions action = new Actions(driver);

		action.moveToElement(admin).moveToElement(job).moveToElement(jobTitles).moveToElement(add).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

	}

}