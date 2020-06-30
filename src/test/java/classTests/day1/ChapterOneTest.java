package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.Chapter1Page;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickChapter1();

        Chapter1Page chapterPage = new Chapter1Page(driver);
        chapterPage.setTextBox("Apples and oranges");

        chapterPage.getClickLinkLaunchlinText();
        chapterPage.getButtonVerifyAttribute();
        chapterPage.BeginnersGuidecssValuePrint();
    }
}
