/*http://leaftaps.com/opentaps/control/main
		 
Delete Lead:
1	Launch the browser	2	Enter the username	3	Enter the password	4	Click Login	5	Click crm/sfa link	6	Click Leads link
7	Click Find leads	8	Click on Phone	9	Enter phone number	10	Click find leads button	11	Capture lead ID of First Resulting lead
12	Click First Resulting lead	13	Click Delete	14	Click Find leads	15	Enter captured lead ID	16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion	18	Close the browser (Do not log out) */

package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day2_Assignment03_DeleteLead {
public static void main(String[] args) {

	ChromeDriver driver01=new ChromeDriver();
	driver01.get("http://leaftaps.com/opentaps/control/login");
	driver01.manage().window().maximize();
	driver01.findElement(By.id("username")).sendKeys("democsr");
	driver01.findElement(By.id("password")).sendKeys("crmsfa");
	driver01.findElement(By.className("decorativeSubmit")).click();	
	driver01.findElement(By.linkText("CRM/SFA")).click();
	driver01.findElement(By.linkText("Leads")).click();
	driver01.findElement(By.linkText("Find Leads")).click();
	driver01.findElement(By.xpath("(//span[contains(@class,'x-tab-strip-text')])[2]")).click();
	driver01.findElement(By.name("phoneCountryCode")).sendKeys("1");
	driver01.findElement(By.name("phoneAreaCode")).sendKeys("682");
	driver01.findElement(By.name("phoneNumber")).sendKeys("1234567890");
	driver01.findElement(By.xpath("(//button[contains(@class,'x-btn-text')])[6]")).click();
	driver01.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String lead01 =driver01.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
	System.out.println(lead01);	
	driver01.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	/*No delete button found*/
	driver01.findElement(By.linkText("Find Leads")).click();
	driver01.findElement(By.xpath("(//input[contains(@class,' x-form-text x-form-field ')])[3]")).sendKeys(lead01);
	/*Error message deletion yet to verify, since delete button is not available*/
	driver01.quit();
	
}
}
