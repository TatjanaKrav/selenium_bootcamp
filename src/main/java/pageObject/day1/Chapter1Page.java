package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.css.CSSValue;

import javax.management.Attribute;

public class Chapter1Page extends BaseFunc {

    public Chapter1Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "belowcenter")
    private WebElement textBox;

    @FindBy(how = How.CLASS_NAME, using = "multiplewindow")
    private WebElement clickLinkLaunch;

    @FindBy(how = How.ID, using = "divinthecenter")
    private WebElement verifyButton;

    @FindBy(how = How.CLASS_NAME, using = "mainheading")
    private WebElement beginnersGuide;

    public void setTextBox() {
        textBox.clear();
        textBox.sendKeys("Apples and oranges");
    }

    public void getClickLinkLaunchlinText(){
        String text = clickLinkLaunch.getText();
        System.out.println(text);
    }

    public void getButtonVerifyAttribute() {
        System.out.println(verifyButton.getAttribute("size"));
    }

    public void BeginnersGuidecssValuePrint() {
        System.out.println(beginnersGuide.getCssValue("color"));
    }

}
