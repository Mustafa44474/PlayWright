package FirstPackage_Playwright;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DownloadFile {
	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=112.0.5615.49/");
		Download download = page.waitForDownload(()->{
			page.click("//a[text()='chromedriver_win32.zip']");
		});
		page.click("//a[text()='chromedriver_win32.zip']");
		System.out.println(download.url());
		String path = download.page().toString();
		System.out.println(path);
		download.saveAs(Paths.get("Mustafa_chrome.zip"));
		download.cancel();
		
		//System.out.println(download.page().title());

	}

}
