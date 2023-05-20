package FirstPackage_Playwright;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUploadHandles {
	public static void main(String[] args) throws InterruptedException {

		Playwright playwright = Playwright.create();
		Browser browsewr = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page newPage = browsewr.newPage();
		newPage.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");

		// Uploading Single file

		/*
		 * newPage.setInputFiles("#filesToUpload", Paths.get("login.json")); // For
		 * Deattaching a file Thread.sleep(4000);
		 * newPage.setInputFiles("#filesToUpload", new Path[0]);
		 * 
		 */
		// Uloading Multiple file

		newPage.setInputFiles("#filesToUpload", new Path[] { Paths.get("login.json"), Paths.get("applogin.json") });
		Thread.sleep(6000);
		newPage.setInputFiles("#filesToUpload", new Path[0]);

	}

}
