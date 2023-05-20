package FirstPackage_Playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorsConcept {
	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//locators
		BrowserContext browsContext = browser.newContext();
		Page page = browsContext.newPage();
		page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//Locator calocator = page.locator("//a[text()='Cameras']");

		//  Locator Cameralocator = page.locator("#input-email");
		//  Cameralocator.fill("Testing");
		  
		  Locator RegisList = page.locator(" //div[@class='list-group']/a");
		  /*
		  System.out.println("Number of Locator in Page is : "+ RegisList.count());
		  for(int i=0; i<RegisList.count();i++) {
			  String textContent = RegisList.nth(i).textContent();
			  System.out.println(textContent);
			  
		  }
		*/  
		  List<String> RegisallTextList = RegisList.allTextContents();
		  /*
		  List<String> RegisallTextList = RegisList.allTextContents();
		  for(String ele: RegisallTextList) {
			  System.out.println(ele);
		  }
		  */
		 RegisallTextList.forEach(ele -> System.out.println(ele));
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
