package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ag.bhavatharini\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		Select select = new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			if(text.contains("Green")) {
				select.selectByVisibleText(text);
			}
			
		}
		
//		boolean multiple = select.isMultiple();
//		System.out.println(multiple);
//		select.selectByIndex(3);
//		select.selectByValue("5");
//		select.selectByVisibleText("Purple");
		Thread.sleep(4000);
		driver.close();

//		driver.navigate().to("https://www.ebay.com/");
//		Thread.sleep(3000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("PocoF1");
//		driver.findElement(By.cssSelector("#gh-btn")).click();
//		js.executeScript("window.scrollBy(0,300)");
		
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.close();
//		driver.quit();
		
//		driver.get("https://www.instagram.com/");
//		driver.manage().window().maximize();
//		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
//		WebElement passWord = driver.findElement(By.name("password"));
//		userName.sendKeys("Bhavatharini");
//		passWord.sendKeys("sfgfhtuk");

		
//		Thread.sleep(6000);
//		driver.navigate().back();
//		Thread.sleep(6000);
//		driver.navigate().forward();
//		Thread.sleep(6000);
//		driver.navigate().refresh();
	
		
	}

	private static void getOptions() {
		// TODO Auto-generated method stub
		
	}

}
