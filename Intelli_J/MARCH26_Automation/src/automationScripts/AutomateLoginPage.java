package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Elements         Tag Name    xpath
// Student ID       input       //input[@id='access-student-id']
// Access Code      input       //input[@id='access-code']
//                              //input[@data-testid='access-code']
// Continue         button      //button[@data-testid='access-submit-btn']

public class AutomateLoginPage {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open specified  url
        driver.get("http://34.173.201.53/#/access");

        // Identify Student ID(input) element using xpath locator and perform action
        driver.findElement(By.xpath("//input[@id='access-student-id']")).sendKeys("F248JK5SK6");

        // Identify Access Code(input) element using xpath locator and perform action
        //driver.findElement(By.xpath("//input[@id='access-code']")).sendKeys("B6FVNRUZ");
        driver.findElement(By.xpath("//input[@data-testid='access-code']")).sendKeys("B6FVNRUZ");

        // Identify Continue(button) element using xpath locator and perform action
        driver.findElement(By.xpath("//button[@data-testid='access-submit-btn']")).click();
    }

}
