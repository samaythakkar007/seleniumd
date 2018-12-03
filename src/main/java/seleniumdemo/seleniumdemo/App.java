package seleniumdemo.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class App 
{

	static BusinessFlow bf;

	public static void main(String[] args) {
	
		BaseUtil bs = new BaseUtil();
		bs.getDriver().get("http://www.google.com");
	
		
		bs.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Nikhalas");
		bs.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}

	public static BusinessFlow getBusinessFlow() {
		
		if(bf == null) {
			bf = new BusinessFlow();
		}
		return bf;
	}
	
}
