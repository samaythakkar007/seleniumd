package seleniumdemo.seleniumdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessFlow {
	HomePage homePage;
	OrderPage orderPage;
	GooglePage googlePage;
	
	public HomePage getHomePage() {
		if(homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public OrderPage getOrderpage() {
		if(orderPage == null) {
			orderPage = new OrderPage();
		}
		return orderPage;
	}
	
	
	 
	public GooglePage getGooglePage() {
		if(googlePage == null) {
			googlePage = new GooglePage();
		}
		return googlePage;
	}	
	
	public void enterPromocode() {
		System.out.println("INsie methiod");
		getHomePage().openUrl();
		getHomePage().clickOrder();
		
		getGooglePage().search(getOrderpage().getPromoCode());
	
	}


}
