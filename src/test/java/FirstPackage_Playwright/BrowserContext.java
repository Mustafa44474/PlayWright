package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class BrowserContext {
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser brws = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		
		com.microsoft.playwright.BrowserContext brwcontext = brws.newContext();
		Page page = brws.newPage();
		
		 

		Page l_Page= brwcontext.newPage(); 
		l_Page.navigate("https://www.facebook.com/");
		System.out.println("Page Title is: " +page.title());
		l_Page.fill("//input[@id='email']", "m.ezam96@yahoo.com");
		l_Page.fill("#pass", "ABDULLAH@321");
		 
		Page g_Page= brwcontext.newPage(); 
		g_Page.navigate("https://www.google.com/");
		System.out.println("Page Title is: " +g_Page.title());
		g_Page.fill("#APjFqb", "Test");
		g_Page.click("div[class='lJ9FBc'] input[name='btnK']");
		
		
		
		
	}

}
