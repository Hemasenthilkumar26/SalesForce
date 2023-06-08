package oppurtunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CreateOppurtunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions option=new EdgeOptions();
		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement oppur = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", oppur);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.click();
		name.sendKeys("Salesforce Automation by Hema");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='5']")).click();
		WebElement stage = driver.findElement(By.xpath("//span[text()='--None--']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",stage);
		stage.click();
		Thread.sleep(5000);
		WebElement stage1 = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
		stage1.click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String successMsg = driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage']")).getText();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
