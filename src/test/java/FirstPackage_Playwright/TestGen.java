package FirstPackage_Playwright;

 
	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import java.util.*;

	public class TestGen {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      com.microsoft.playwright.BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Jun");
	      page.getByPlaceholder("Last Name").click();
	      page.getByPlaceholder("Last Name").fill("Mine");
	      page.getByPlaceholder("E-Mail").click();
	      page.getByPlaceholder("E-Mail").fill("Bes");
	      page.getByPlaceholder("Telephone").click();
	      page.getByPlaceholder("Telephone").fill("9169787787");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).click();
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("Test@21");
	      page.getByPlaceholder("Password Confirm").click();
	      page.getByPlaceholder("Password Confirm").fill("Test");
	      page.getByText("Yes").click();
	      page.getByRole(AriaRole.CHECKBOX).check();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
	       
	  }
	}

}
