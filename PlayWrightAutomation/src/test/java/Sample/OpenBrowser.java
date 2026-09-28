package Sample;


import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class OpenBrowser {

    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setExecutablePath(
                                    Paths.get(
                                        "C:\\Users\\Tonney Sara\\eclipse-workspace\\AutomationPlayWright\\chrome-win64\\chrome.exe"
                                    )
                            )
            );

            Page page = browser.newPage();

            page.navigate("https://www.google.com");

            System.out.println("Page title: " + page.title());

            browser.close();
        }
    }
}