package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {
	public static void main(String[] args) {
		
		
		
		Playwright playwright = Playwright.create();
		Browser browsewr = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page newPage = browsewr.newPage();
		newPage.navigate("http://londonfreelance.org/courses/frames/index.html");
		/*
		String headerText = newPage.frameLocator("//frame[@name='main']").locator("h2").textContent();
		 System.out.println(headerText);
		*/
		String textContent = newPage.frame("main").locator("h2").textContent();
		System.out.println(textContent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
