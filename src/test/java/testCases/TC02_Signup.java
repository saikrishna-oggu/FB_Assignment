package testCases;

import com.facebook.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC02_Signup extends Baseclass
{

    @Test
    public void verifyValidationMessages()
    {
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        lp.clickCreatAccountbtn();
        lp.verifyErrorMessages();

    }
    @Test
    public void verifysignupWithValidData()
    {
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        lp.clickCreatAccountbtn();
        lp.enterValidDetails();
    }

    @Test
    public void verifysignupWithinvalidDob()
    {
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        lp.clickCreatAccountbtn();
        lp.enterInValidDetails();
    }


}
