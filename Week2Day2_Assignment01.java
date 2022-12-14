/**Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) **/

package week2.day1;

import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day2_Assignment01 {
public static void main(String[] args) {
	ChromeDriver driver01=new ChromeDriver();
	driver01.get("https://en-gb.facebook.com/");
	driver01.manage().window().maximize();
	driver01.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver01.findElement(By.xpath("//a[text()='Create New Account']")).click();
	driver01.findElement(By.xpath("//input[contains(@class,'inputtext _58mg _5dba _2ph')]")).sendKeys("testfirst");
	driver01.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph')])[2]")).sendKeys("testlastname");
	driver01.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph')])[3]")).sendKeys("7502294709");
	driver01.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph')])[5]")).sendKeys("Mona@892013");
	Select SS1=new Select(driver01.findElement(By.id("day")));
	SS1.selectByVisibleText("12");
	Select SS2=new Select(driver01.findElement(By.id("month")));
	SS2.selectByVisibleText("Jun");
	Select SS3=new Select(driver01.findElement(By.id("year")));
	SS3.selectByVisibleText("1995");
	driver01.findElement(By.xpath("//label[@class='_58mt']")).click();
	
	
}
}
