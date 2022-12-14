/* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator  3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link  5. Click on contacts Button
6. Click on Create Contact  7. Enter FirstName Field Using id Locator
8. Enter LastName Field Using id Locator 9. Enter FirstName(Local) Field Using id Locator
10. Enter LastName(Local) Field Using id Locator 11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 13. Enter your email in the E-mail address Field using the locator of your choice
14. Select State/Province as NewYork Using Visible Text 15. Click on Create Contact
16. Click on edit button 17. Clear the Description Field using .clear
18. Fill ImportantNote Field with Any text 19. Click on update button using Xpath locator
20. Get the Title of Resulting Page.*/

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day02_Assignment02_CreateContact {
public static void main(String[] args) {
	
	ChromeDriver driver01=new ChromeDriver();
	driver01.get("http://leaftaps.com/opentaps/control/login");
	driver01.manage().window().maximize();
	driver01.findElement(By.id("username")).sendKeys("democsr");
	driver01.findElement(By.id("password")).sendKeys("crmsfa");
	driver01.findElement(By.className("decorativeSubmit")).click();	
	driver01.findElement(By.linkText("CRM/SFA")).click();
	driver01.findElement(By.linkText("Contacts")).click();
	driver01.findElement(By.linkText("Create Contact")).click();
	driver01.findElement(By.id("firstNameField")).sendKeys("TestFirstName");
	driver01.findElement(By.id("lastNameField")).sendKeys("TestLastName");
	driver01.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("FirstNameLocal");
	driver01.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LastNameLocal");
	driver01.findElement(By.name("departmentName")).sendKeys("TestDepartment");
	driver01.findElement(By.name("description")).sendKeys("Test Description field");
	driver01.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Testselenium@gmail.com");
	Select SS1=new Select(driver01.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
	SS1.selectByVisibleText("New York");
	driver01.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
	driver01.findElement(By.linkText("Edit")).click();
	driver01.findElement(By.id("updateContactForm_description")).clear();
	driver01.findElement(By.id("updateContactForm_importantNote")).sendKeys("TestNote_EditMode");
	driver01.findElement(By.xpath("//input[@value='Update']")).click();
	System.out.println(driver01.getTitle());

}
}
