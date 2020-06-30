package classTests.day1.activities;

import baseWebTest.BaseWebTest;
import day1.ChapterOnePage;
import day1.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChapterOneTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo() {
        navigateTo("http://book.theautomatedtester.co.uk/");
    }

    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("And His Name Is JOHN CENA!!!");



        chapterPage.getTextOfWindowLink();
        chapterPage.getAttributeOfVerifyButton();
        chapterPage.getCssValueOfMainHeading();
    }

}
