package seleniumdemo.seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseUtil {
	
	
	WebDriver driver;
	public WebDriver getDriver() {
		
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samthakk\\Desktop\\chromedriver.exe");
		

		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
		
	}
	
	
	public WebElement getElement(String element) {
		By by = null;
		String[] arr = element.split("-->"); 
		String byType = arr[0];
		String elementStr = arr[1];
		if(byType.equalsIgnoreCase("xpath")) {
			by = By.xpath(elementStr);
		}else if (byType.equals("id")) {
			by = By.id(elementStr);
		}
		return getDriver().findElement(by);
		
		
	}
	
	public BaseUtil click(String element) {
		try {
		getElement(element).click();
		}
		catch(Exception e) {
			System.out.println("Not able to click " + element);
		}
		return this;
	}
	
	public BaseUtil getPage(String url) {
		System.out.println("NAVINGATING");
		getDriver().get(url);
		return this;
	}
	
	public BaseUtil sendKeys(String element , String text) {
		
		getElement(element).sendKeys(text);
		return this;
	}
	
	
	
	
	
}
