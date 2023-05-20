package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class TextSelectors {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page newPage = browser.newPage();
		newPage.navigate("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		Locator camlocator = newPage.locator("text = Cameras");
		Locator newslocator = newPage.locator("'Newsletter'");
		/*
		 * System.out.println(newslocator.count()); for (int i = 0; i <
		 * newslocator.count(); i++) { String textContent =
		 * newslocator.nth(i).textContent(); System.out.println(textContent); if
		 * (textContent.equals("Forgotten Password")) { newslocator.nth(i).click();
		 * break;
		 * 
		 * "div.card-body h2: has-text('New Customer')" }
		 * 
		 * }
		 */

		//String locator = newPage.locator("//h2[text()='New Customer']").textContent();
		Locator newlocator = newPage.locator("'New Customer'");
		Locator newsslocator = newPage.locator("text = New Customer");
		String textContent = newsslocator.textContent();
		System.out.println(textContent);
	}

}
