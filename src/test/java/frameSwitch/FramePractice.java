package frameSwitch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FramePractice {
	
	@Test
	public  void mainTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		//driver.switchTo().frame(ele);
		//driver.switchTo().frame("iframeResult");
//		int size =driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		driver.switchTo().frame("iframeResult");
//		
//		//driver.switchTo().frame(1);
//		Thread.sleep(2000);
//		WebElement clear =driver.findElement(By.xpath("//input[@id='fname']"));
//		WebDriverWait wait = new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.visibilityOf(clear));
//		clear.clear();
//		
//		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("motin");
//		
//		driver.findElement(By.xpath("//input[@id='lname']")).clear();
//		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("zack");
//		
//		
//		
//		
		
	}

	
	}


