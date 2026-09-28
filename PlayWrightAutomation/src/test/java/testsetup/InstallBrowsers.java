package testsetup;

import java.io.IOException;

import com.microsoft.playwright.CLI;

public class InstallBrowsers {

    public static void main(String[] args) throws IOException, InterruptedException {

        CLI.main(new String[]{"install", "chromium"});

    }
}