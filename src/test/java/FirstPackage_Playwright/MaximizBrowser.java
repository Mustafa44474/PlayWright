package FirstPackage_Playwright;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;

public class MaximizBrowser {
	public   static void main(String []aregs) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext newContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1020,800));
		Page page = newContext.newPage();
		page.navigate("https://www.google.com/");
		
	
		 
		 
		
	}

}
