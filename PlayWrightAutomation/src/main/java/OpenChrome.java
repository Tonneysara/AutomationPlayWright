

import java.nio.file.Paths;
import com.microsoft.playwright.*;

public class OpenChrome {

    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setExecutablePath(Paths.get(
                                    "C:\\Users\\Tonney Sara\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"))
                            .setHeadless(false)
            );

            Page page = browser.newPage();

            page.navigate("https://www.google.com");

            System.out.println("Page Title: " + page.title());

            browser.close();
        }
    }
}
