package automationScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_080626_1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationbykrishna.com/"); // strings starts with http or https

        String title = driver.getTitle();

        // TC1
        System.out.println("Executing TC1");
        if(title.equals("Login Signup Demo")){
            System.out.println("TC 1 passed");
        }else{
            System.out.println("TC 1 failed");
        }

        String currentUrl = driver.getCurrentUrl();

        // TC2
        System.out.println("Executing TC2");
        if(currentUrl.equals("http://automationbykrishna.com/")){
            System.out.println("TC2 passed");
        }else{
            System.out.println("TC2 failed");
        }
    }
}
