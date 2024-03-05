package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import basetest.BaseTest;
import pages.LoginPage;

public class OpenBrowser extends BaseTest {

//LoginPage lpage= new LoginPage(driver);
LoginPage lpage;

    @Test(priority = 1)
    public void openFacebookTest() {
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        Assert.assertEquals(title, "Facebook – log in or sign up");
    }

    @Test(priority = 2)
    public void loginTest() throws InterruptedException {
        lpage = new LoginPage(driver);
        lpage.enterUserName("Siddu");
        lpage.enterPassword("1223455");
        lpage.clickOnLogin();
        Thread.sleep(22000);
    }


}
