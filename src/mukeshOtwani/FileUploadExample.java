package mukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadExample {

	@Test
	public void uploadFile() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/AutoITTutorial/fileupload.html");
		//driver.get(System.getProperty("user.dir")+".\\fileUploaderHtmlExample\\fileuploader.html");
		
		Thread.sleep(2000);

		WebElement e1=driver.findElement(By.id("1"));
		System.out.println(e1.getAttribute("id"));
		
        Actions a=new Actions(driver);
		a.moveToElement(e1).click().perform();
	
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec(".\\autoITScript\\FileUploader1.exe");
		
	}
}
