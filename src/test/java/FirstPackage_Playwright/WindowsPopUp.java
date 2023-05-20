package FirstPackage_Playwright;

import javax.swing.Popup;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowsPopUp {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext firtndnewContextP = browser.newContext();
		Page firstpage = firtndnewContextP.newPage();
		/*
		 * BrowserContext secondstnewContextP = browser.newContext(); Page firstpage =
		 * firtndnewContextP.newPage(); Page secondpage = secondstnewContextP.newPage();
		 * firstpage.navigate("https://naveenautomationlabs.com/opencart/");
		 * secondpage.navigate("https://www.google.com/");
		 */
		firstpage.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		Page popUp = firstpage.waitForPopup(() -> {
			firstpage.click("(//div[@class='orangehrm-login-footer-sm']/a)[3]");
		});

		System.out.println("PopUp Title is:" + popUp.title());
		System.out.println(popUp.url());
		popUp.close();
		System.out.println("Parentwindotitle is: " + firstpage.title());
		*/
		
		Page popUp = firstpage.waitForPopup(() -> {
			firstpage.click("a[target='_blank']"); // This will open a new blank tabe
		});
		popUp.waitForLoadState();
		popUp.navigate("https://twitter.com/orangehrm?lang=en");
		System.out.println("Child window Tittle is: --- >   " + popUp.title());
		popUp.close();
		System.out.println("Parent windo Title is: --- >  "+ firstpage.title());
		firstpage.close();

	}

}
