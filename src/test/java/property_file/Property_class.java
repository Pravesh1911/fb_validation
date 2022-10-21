package property_file;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91880\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("asgsgdhdd");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("12354687997");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		

	}

}
