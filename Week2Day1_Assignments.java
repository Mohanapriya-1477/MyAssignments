package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Week2Day1_Assignments {
public static void main(String[] args) {
	EdgeDriver driver1=new EdgeDriver();
	driver1.get("http://leaftaps.com/opentaps");
	System.out.println("Opened title is:" + driver1.getTitle());
	WebElement username = driver1.findElement(By.id("username"));
	WebElement password= driver1.findElement(By.id("password"));
	username.sendKeys("Demosalesmanager");
	password.sendKeys("crmsfa");
	WebElement login=driver1.findElement(By.className("decorativeSubmit"));
	login.click();
	driver1.close();
	
	ChromeDriver driver2=new ChromeDriver();
	driver2.get("https://login.salesforce.com/");
	WebElement username1=driver2.findElement(By.id("username"));
	WebElement password1=driver2.findElement(By.id("password"));
	username1.sendKeys("hari.radhakrishnan@qeagle.com");
	password1.sendKeys("Testleaf$321");
	WebElement login1=driver2.findElement(By.id("Login"));
	login1.click();
	driver2.close();
	
	}
}
