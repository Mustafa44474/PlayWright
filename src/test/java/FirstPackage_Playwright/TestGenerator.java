package FirstPackage_Playwright;

 
	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.*;

	public class TestGenerator {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      com.microsoft.playwright.BrowserContext context = browser.newContext();
	      context.tracing().start(new Tracing.StartOptions()
	    		  .setScreenshots(true)
	    		  .setSnapshots(true)
	    		  .setSources(true));
	      Page page = context.newPage();
	      page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	      page.getByPlaceholder("First Name").click();
	      page.getByPlaceholder("First Name").fill("Ata");
	  
	      page.getByPlaceholder("Last Name").fill("Sed");
	     
	      page.getByPlaceholder("E-Mail").fill("ata.s1122ed@gmail.com");
	   
	      page.getByPlaceholder("Telephone").fill("9183986564");
	    
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("Test@321");
	    
	      page.getByPlaceholder("Password Confirm").fill("Test@321");
	      page.getByText("Yes").click();
	      page.getByRole(AriaRole.CHECKBOX).check();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
	      page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Your Account Has Been Created!")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Continue")).click();
	      context.tracing().stop(new Tracing.StopOptions()
	    		  .setPath(Paths.get("trace.zip")));
	    }
	  }
	 

}
