package day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class elementPage extends BaseFunc{
    public elementPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.LINK_TEXT, using = "Chapter1")
    private WebElement chapter1;

    @FindBy(how = How.ID, using = "htm5div")
    private WebElement textBox;


}
