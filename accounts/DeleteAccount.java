package accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DeleteAccount {

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
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",account);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Hema",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Hema']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']/parent::button")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText());

	}

}
