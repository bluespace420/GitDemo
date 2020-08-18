import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws SecurityException, IOException {
	

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		

       Select se=new Select(driver.findElement(By.id("select-demo")));
       
       se.selectByVisibleText("Tuesday");
       
       //se.deselectAll();
       
       Select se2=new Select(driver.findElement(By.id("multi-select")));
       
       se2.selectByVisibleText("Washington");
       
       
       
       TakesScreenshot ts= ((TakesScreenshot)driver);
      File fs= ts.getScreenshotAs(OutputType.FILE);
		
     
		FileHandler.copy(fs, new File("D://asd.jpg"));
		
	
		
	}

}
