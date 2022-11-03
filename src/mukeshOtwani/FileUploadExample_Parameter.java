package mukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadExample_Parameter {

	@Test
	public void uploadFile() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("D:\\Worspace2\\AutoIT_Examples_Project\\fileUploaderHtmlExample\\fileuploader.html");
		driver.get(System.getProperty("user.dir")+".\\fileUploaderHtmlExample\\fileuploader.html");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.id("1")).click();
		
		WebElement e1=driver.findElement(By.id("1"));
		System.out.println(e1.getAttribute("id"));
		
        Actions a=new Actions(driver);
		a.moveToElement(e1).click().perform();
		
		Thread.sleep(2000);
		
		String FilePath=System.getProperty("user.dir")+".\\TestData\\file1.txt";
		/*Runtime.getRuntime().exec(".\\autoITScript\\FileUploader1.exe","");*/
		
		ProcessBuilder pb=new ProcessBuilder(".\\autoITScript\\FileUploaderParameter.exe",FilePath);
		pb.start();
		
	}
}
