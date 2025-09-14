package org.example;

import com.microsoft.playwright.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setArgs(Arrays.asList("--start-maximized"))
                    .setHeadless(false)); // Set to false to see the browser UI
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(null)); // Disable Playwright's default viewport
            Page page = context.newPage();
            page.navigate("https://www.google.com/");
            page.pause();
            page.close();
        }
    }
}