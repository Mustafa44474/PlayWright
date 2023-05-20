package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Page;

public class JsPopUpHandle {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.onDialog(dialog ->{
			String message = dialog.message();
			System.out.println(message);
			dialog.accept();
			dialog.dismiss();
			dialog.accept("This is My alert from Automation Team");
		});
		
		page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		page.click("//button[text()='Click for JS Alert']");
		page.click("//button[text()='Click for JS Confirm']");
		page.click("//button[text()='Click for JS Prompt']");
		
		String retult = page.textContent("#result");
		System.out.println(retult);
		page.close();
		browser.close();
		playwright.close();
		
		
		
		
		
		
		
		
	}

}
