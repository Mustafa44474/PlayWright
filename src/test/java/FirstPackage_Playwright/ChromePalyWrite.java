package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ChromePalyWrite {
	public static void main(String[] args) {
		
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		lp.setChannel("msedge");
		lp.setHeadless(false);
		Browser browser = playwright.chromium().launch(lp);
		
		// Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)
				
			//setChannel("chrome")
			//.setChannel("msedge")
			//	);
		
		//Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		System.out.println(page.title());
		
		
	}

}
