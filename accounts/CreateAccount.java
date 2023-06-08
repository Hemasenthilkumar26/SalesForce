package accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CreateAccount {

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
		driver.findElement(By.xpath("//a[@title='Accounts']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Hema Senthilkumar");
		driver.findElement(By.xpath("(//button[@class='slds-combobox_input slds-input_faux slds-combobox_input-value'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
	}

}
