package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class GooglePage {

    private Page page;
    private Locator searchBox;
    private Locator firstSearchResult;

    public GooglePage(Page page) {

        this.page = page;

        searchBox = page.locator("textarea").first();

        firstSearchResult = page.locator("h3").first();
    }

    public void search(String keyword) {

        searchBox.fill(keyword);

        searchBox.press("Enter");
    }

    public String getFirstSearchResultTitle() {

        return firstSearchResult.innerText();
    }
}