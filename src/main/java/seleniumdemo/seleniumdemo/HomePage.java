package seleniumdemo.seleniumdemo;

import org.springframework.stereotype.Component;

@Component
public class HomePage extends BaseUtil {

	public String lnDemo = "xpath-->(//span[@class='lvl-1'])[1]";

	public String lnOrder = "xpath-->(//span[@class='lvl-1'])[2]";

	public HomePage clickDemo() {
		try {
		click(lnDemo);
	}catch(Exception e) {
		System.out.println("Not able to click on Demo link");
	}
	
		return this;

	}
	
	public HomePage clickOrder() {
		try {
			click(lnOrder);
		}catch(Exception e) {
			System.out.println("Not able to click on order link");
		}
		return this;
	}
	
	public HomePage openUrl() {
		getPage(Constants.PHP_TRAVELS_URL);
		return this;	
	}

	
}