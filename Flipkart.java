package ama;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	static WebDriver driver;
	static WebElement element;
	static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.airtel.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,30);
		Actions act = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@class='actions-list-container'][5]"));
		act.moveToElement(move).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(move));
		driver.findElement(By.linkText("Get New Account")).click();
		
	}

}
