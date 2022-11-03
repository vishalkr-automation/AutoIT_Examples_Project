package mukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {

	@Test
	public void uploadFile() throws Exception{
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		
		//driver.get("D:\\E_Drive\\Video Tutorial\\AutoIT Tutorial\\fileuploader.html");
		//driver.get("C:\\Users\\visha\\OneDrive\\Desktop\\fileupload.html");
		
	//	Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='1']")).click();
		
		//Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Projects\\AutoIT_Examples_Project\\autoITScript\\DownloadFile.exe");
		
	}
}
