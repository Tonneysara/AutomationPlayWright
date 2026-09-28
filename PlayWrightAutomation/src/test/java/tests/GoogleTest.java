package tests;

import org.testng.annotations.Test;

import base.Base;
import pages.GooglePage;

public class GoogleTest extends Base {

    @Test
    public void googleSearchTest() {

        page.navigate("https://www.google.com");

        GooglePage googlePage = new GooglePage(page);

        googlePage.search("playwright automation");

        String title = googlePage.getFirstSearchResultTitle();

        System.out.println("First search result: " + title);
    }
}