package classTests.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "Chapter1")
    private WebElement chapter1Element;
    @FindBy(how = How.XPATH, using = "html5div")
    private WebElement textBox;
    @FindBy(how = How.XPATH, using = "multiplewindow")
    private WebElement link1;
    @FindBy(how = How.XPATH, using = "verifybutton")
    private WebElement verifyButton;
    @FindBy(how = How.XPATH, using = "mainheading")
    private WebElement mainHeading;
    public void setTextBox(String textToSend){
        textBox.clear();
        textBox.sendKeys(textToSend);
    }
    public void getTextOfWindowLink(){
        String text = link1.getText();
        System.out.println(text);
    }

    public void getAttributeOfButton(){
        String attribute1 = verifyButton.getAttribute("value");
        System.out.println(attribute1);

    }
    public void getColorOfHeading(){
        String color = mainHeading.getCssValue("color");
        System.out.println(color);
    }









}
