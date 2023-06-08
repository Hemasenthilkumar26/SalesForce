package oppurtunity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EditOppurtunity {

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
	    WebElement search = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
	    search.click();
	    search.sendKeys("Hema Senthilkumar",Keys.ENTER);
	    Thread.sleep(5000);
	    WebElement click = driver.findElement(By.xpath("//a[@title='Hema Senthilkumar']"));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", click);
	    WebElement dd = driver.findElement(By.xpath("//span[text()='Show more actions']"));
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", dd);
	    driver.findElement(By.xpath("//a[@name='Edit']")).click();
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    driver.findElement(By.xpath("//span[text()='6']")).click();
	    WebElement dd1 = driver.findElement(By.xpath("//button[@aria-label='Stage, Needs Analysis']"));
	    JavascriptExecutor js4=(JavascriptExecutor) driver;
	    js4.executeScript("arguments[0].scrollIntoView(true);", dd1);
	    dd1.click();
	    driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
	    WebElement dd2 = driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']"));
	    JavascriptExecutor js5=(JavascriptExecutor) driver;
	    js5.executeScript("arguments[0].scrollIntoView(true);", dd2);
	    dd2.click();
	    driver.findElement(By.xpath("//span[@title='In progress']")).click();
	    WebElement description = driver.findElement(By.xpath("//label[text()='Description']"));
	    description.click();
	    description.sendKeys("Salesforce");
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    String successMsg = driver.findElement(By.xpath("//div[@data-aura-class='forceToastMessage']")).getText();
	    System.out.println(successMsg);	
	}

}
