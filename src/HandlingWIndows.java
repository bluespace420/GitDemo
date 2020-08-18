import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWIndows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://accounts.google.com/signup");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		
		Set<String>ids=driver.getWindowHandles();
		
		Iterator<String>it=ids.iterator();
		
		String parentid=it.next();
		
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		

	}

}
