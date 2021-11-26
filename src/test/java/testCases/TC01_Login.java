package testCases;

import com.facebook.pageObjects.LoginPage;
import javafx.scene.control.Alert;
import org.testng.annotations.Test;

public class TC01_Login extends Baseclass

{
    @Test(priority = 1)
    public void verifySingupSection()
    {
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        String currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);
        driver.navigate().to(currenturl);
        lp.clickCreatAccountbtn();
        lp.VerifySignupText();
    }

    @Test (priority = 2)
    public void loginWithValidDetails()
    {
        LoginPage lp = new LoginPage(driver);
        driver.get(baseURL);
        lp.enterUsername();
        lp.enterPassword();
        lp.clickLogin();
        lp.clickprofile();
        lp.verifyTxtUsername();
    }

}
