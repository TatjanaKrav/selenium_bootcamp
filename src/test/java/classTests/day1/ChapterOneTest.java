package classTests.day1;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");



    }

    @Test
    public void chapterOneTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickChapterOne();

        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hi there");

        chapterPage.getTextOfWindowLink();
        chapterPage.getColorOfHeading();
        chapterPage.getAttributeOfButton();


        


    }
}
