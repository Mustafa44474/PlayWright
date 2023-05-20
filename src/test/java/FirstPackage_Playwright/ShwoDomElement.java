package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShwoDomElement {
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page newPage = browser.newPage();
		/*
		newPage.navigate("https://books-pwakit.appspot.com/");
		newPage.locator("book-app[apptitle='BOOKS' ] #input").fill("Testing is best");
		String textContent = newPage.locator("book-app[apptitle='BOOKS' ] .books-desc").textContent();
		System.out.println(" The Element text is: " +textContent);
		
		*/
		
		newPage.navigate("https://selectorshub.com/xpath-practice-page/");
		newPage.frameLocator("#pact").locator("div#snaktime #tea").fill("I love green tea");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
