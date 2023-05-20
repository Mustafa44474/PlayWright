package FirstPackage_Playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LogintoApp {
	public static void main(String[] args) {
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext newContext = browser.newContext();
	Page page = newContext.newPage();
	page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	page.fill("input#input-email", "gmustafa.siddiqi@gmail.com");
	page.fill("input#input-password", "Automation@321");
	page.click("//input[@value='Login']");
	newContext
	.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("login.json")));
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
