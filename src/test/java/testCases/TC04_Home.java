package testCases;

import com.facebook.pageObjects.Homepage;
import com.facebook.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC04_Home extends Baseclass
{
    @Test
    public void verifySearchFunctionality()
    {
        Homepage hp = new Homepage(driver);
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        lp.enterUsername();
        lp.enterPassword();
        lp.clickLogin();
        hp.VerifySearch();
    }
}
