import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.getPageSource();
		
		//driver.navigate().to("https://in.yahoo.com");
		//driver.navigate().back();
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("ecompzone@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("password427");
		//driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
	
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("8");
		//s.selectByIndex(2);
		//s.selectByVisibleText("Option2");
		
		
		/*driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		java.util.List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
					
				{
				
				 option.click();
			      break;
				}
			
		}*/
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("")));
		
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
