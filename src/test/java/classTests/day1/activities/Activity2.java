package classTests.day1.activities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        WebElement chapter1Element = driver.findElement(By.xpath("//a[text()='Chapter1']"));
        chapter1Element.click();
        WebElement textBox = driver.findElement(By.xpath("//div[@id='html5div']"));
        textBox.clear();
        textBox.sendKeys("Hi there");
        WebElement link1 = driver.findElement(By.xpath("//div[@class='multiplewindow']"));
        String textFromLink1 = link1.getText();
        System.out.println(textFromLink1);
        WebElement verifyButton = driver.findElement(By.xpath("//input[@id='verifybutton']"));
        String verifyButtonAttribute = verifyButton.getAttribute("value");
        System.out.println(verifyButtonAttribute);
        WebElement mainHeading = driver.findElement(By.xpath("//div[@class='mainheading']"));
        String cssTextHeading = mainHeading.getCssValue("color");
        System.out.println(cssTextHeading);
        //find element "Chapter 1" and  click on it
        // clear text from text box
        //  and send text to same text box

        //from element "Click this link to launch another window" print out text
        //from "Verify button" get attribute ( any you like) and print out
        //from header " Selenium: Beginners Guide" get cssValue color also print out it


    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
