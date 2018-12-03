package seleniumdemo.seleniumdemo;

import org.springframework.stereotype.Component;

@Component
public class GooglePage extends BaseUtil {
	
	
	
	String searchBox = "id-->lst-ib";
	
	
	public void openGoogle() {
		
		
		getPage(Constants.GOOGLE_URL);
		
	}
	
	public void search(String text) {
		
		openGoogle();
		
		try {
		sendKeys(searchBox, text);
		
		}catch(Exception e){
			System.out.println("Not able to send keys in searhc box google");
		}
		
	}

	
	
}