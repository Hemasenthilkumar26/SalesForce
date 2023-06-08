package accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeOptions option=new EdgeOptions();
		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Actions action=new Actions(driver);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",accounts);
		driver.findElement(By.xpath("//a[@title='Aparna']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//a[@name='Edit']")).click();
		WebElement type = driver.findElement(By.xpath("//button[@aria-label='Type, --None--']"));
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",type);
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		WebElement industry = driver.findElement(By.xpath("//button[@aria-label='Industry, --None--']"));
		industry.click();
		WebElement health = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();",health);
		WebElement billAdd = driver.findElement(By.xpath("//textarea[@name='street']"));
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("arguments[0].scrollIntoView();",billAdd);
		billAdd.click();
		billAdd.sendKeys("xyz");
		WebElement shipAdd = driver.findElement(By.xpath("(//textarea[@name='street'])[2]"));
		shipAdd.click();
		shipAdd.sendKeys("abc");
		driver.findElement(By.xpath("//button[@aria-label='Customer Priority, --None--']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		driver.findElement(By.xpath("//button[@aria-label='SLA, --None--']")).click();
		
		

	}

}
