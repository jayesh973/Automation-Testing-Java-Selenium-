package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_120626_CheckBox_RadioButton {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationbykrishna.com/");

        driver.findElement(By.xpath("//a[@id='basicelements']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement elementRadioButton2 = driver.findElement(By.xpath("//input[@id='optionsRadios2']"));

        // Scrolling the page till the element RadioButton2

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elementRadioButton2);

        // Now perform action on element
        elementRadioButton2.click();

        WebElement elementJavascriptAlert = driver.findElement(By.xpath("//button[@id='javascriptAlert']"));
        js.executeScript("arguments[0].scrollIntoView(true);", elementJavascriptAlert);
        elementJavascriptAlert.click();

    }
}
