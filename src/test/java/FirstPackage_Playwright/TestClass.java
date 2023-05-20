package FirstPackage_Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class TestClass {
	public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Abdul");
	      page.getByPlaceholder("First Name").press("Tab");
	      page.getByPlaceholder("Last Name").fill("Sahak");
	      page.getByPlaceholder("Last Name").press("Tab");
	      page.getByPlaceholder("E-Mail").fill("abdul.shah2123232@gmail");
	      page.getByPlaceholder("E-Mail").press("Tab");
	      page.getByPlaceholder("Telephone").fill("9163986362");
	      page.getByPlaceholder("Telephone").press("Tab");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("Test@321");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).press("Tab");
	      page.getByPlaceholder("Password Confirm").fill("Test@321");
	      page.getByText("Yes").click();
	      page.getByRole(AriaRole.CHECKBOX).check();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
	      page.getByPlaceholder("E-Mail").click();
	      page.getByPlaceholder("E-Mail").click();
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").press("ArrowLeft");
	      page.getByPlaceholder("E-Mail").fill("abdul.shah21232325555@gmail");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
	      page.getByPlaceholder("E-Mail").click();
	      page.getByPlaceholder("E-Mail").fill("abdul.shah21232325555@gmail.com");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
	      page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Your Account Has Been Created!")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Continue")).click();
	    }
	  }

}
