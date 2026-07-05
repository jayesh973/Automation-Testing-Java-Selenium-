package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Open browser

        driver.manage().window().maximize(); // Maximize the browser window
    }

}
