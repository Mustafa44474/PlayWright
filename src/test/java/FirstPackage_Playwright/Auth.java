package FirstPackage_Playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Auth {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();	
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("login.json")));
		Page page = browserContext.newPage();
		page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}

}
