package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locators {
	public static void main(String[] args) {
		
	 
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page = browser.newPage();
	page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	System.out.println("Page Title is: " +page.title());
	Locator firstName = page.locator("#input-firstname"); 
	firstName.fill("Mike");
	Locator LastName =page.locator("#input-lastname");
	LastName.fill("Tomy");
	Locator email = page.locator("//input[@id='input-email']");
	email.fill("Mike20502@gmail.com");
	Locator phone = page.locator("//input[@id='input-telephone']");
	phone.fill("9165954755");
	Locator password =page.locator("#input-password");
	password.fill("Mike@321");
	Locator confirmpassword =page.locator("#input-confirm");
	confirmpassword.fill("Mike@321");
	Locator  newLater = page.locator("input[value='1'][name='newsletter']");
	newLater.click();
	Locator  privacyPolicy = page.locator("input[value='1'][name='agree']") ;
	privacyPolicy.click();
	Locator  contineu= page.locator("input[value='Continue']") ;
	contineu.click();
//	 page.close();
//	 browser.close();
//	 playwright.close();
//	
	
	
	
	
	
	

	}  

}
