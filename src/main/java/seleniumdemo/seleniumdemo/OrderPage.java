package seleniumdemo.seleniumdemo;

import org.springframework.stereotype.Component;

@Component
public class OrderPage extends BaseUtil {

	String txtPromoCode = "xpath-->(//strong[@style='font-family:tahoma'])[1]";
	
	
	public String getPromoCode(){
		
		return getElement(txtPromoCode).getText();
	}
	
	
	


}
