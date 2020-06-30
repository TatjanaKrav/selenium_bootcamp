package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static javax.swing.text.html.CSS.getAttribute;

public class Activity2 {
    private WebDriver driver;

    @Before
    public void setDriver() {
        String userdirLib =  System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", userdirLib + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk/");
    }


    @Test
    public void practiceWithWebElement() {

        //find element "Chapter 1" and  click on it

        WebElement chapter1 = driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]"));
        chapter1.click();

        // clear text from text box
        //  and send text to same text box
        WebElement textBox = driver.findElement(By.id("html5div"));
        textBox.clear();
        textBox.sendKeys("New text");

        //from element "Click this link to launch another window" print out text
        System.out.println(driver.findElement(By.className("multiplewindow")).getText());

        //from "Verify button" get attribute ( any you like) and print out
        System.out.println(driver.findElement(By.id("verifybutton")).getAttribute("value"));

        //from header " Selenium: Beginners Guide" get cssValue color also print out it
        System.out.println(driver.findElement(By.className("mainheading")).getCssValue("color"));


    }

    @After
    public void closeBrowser() {

        driver.quit();
    }

}
