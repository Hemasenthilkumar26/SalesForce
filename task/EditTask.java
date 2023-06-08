package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions option=new EdgeOptions();
		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		Actions action=new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement task = driver.findElement(By.xpath("//span[text()='Tasks']"));
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",task);
		driver.findElement(By.xpath("//span[text()='Bootcamp']")).click();
		Thread.sleep(5000);
		WebElement dd = driver.findElement(By.xpath("//li[contains(@class,'slds-button slds-button--')][4]"));
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", dd);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//a[text()='Normal']")).click();
		driver.findElement(By.xpath("//a[text()='Low']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
