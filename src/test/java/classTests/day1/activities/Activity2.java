package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.day1.Chapter1Page;

import javax.swing.*;

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

        WebElement Chapter1 = driver.findElement(By.xpath("//a[@href='/chapter1']"));
        Chapter1.click();
        //find element "Chapter 1" and  click on it

        WebElement TextBox = driver.findElement(By.className("belowcenter"));
        TextBox.clear();
        TextBox.sendKeys("Apples and pears");
        // clear text from text box
        //  and send text to same text box

        System.out.println(driver.findElement(By.className("multiplewindow")).getText());

        System.out.println(driver.findElement(By.className("multiplewindow2")).getText());
        //from element "Click this link to launch another window" print out text

        System.out.println(driver.findElement(By.id("divinthecenter")).getAttribute("size"));
        //from "Verify button" get attribute ( any you like) and print out

        System.out.println(driver.findElement(By.className("mainheading")).getCssValue("color"));
        //from header " Selenium: Beginners Guide" get cssValue color also print out it

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
