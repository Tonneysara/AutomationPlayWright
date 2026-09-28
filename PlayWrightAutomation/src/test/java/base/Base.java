package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;

import com.microsoft.playwright.*;

public class Base {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeMethod
    public void beforeMethod() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(java.util.Arrays.asList(
                                "--disable-blink-features=AutomationControlled"
                        ))
        );

        context = browser.newContext();

        page = context.newPage();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(java.nio.file.Paths.get(
                                    "screenshots/" + result.getName() + ".png"
                            ))
                            .setFullPage(true)
            );
        }

        if (context != null) {
            context.close();
        }

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }
}