package testCases;

import com.facebook.pageObjects.LoginPage;
import com.facebook.pageObjects.ProfilePage;
import org.testng.annotations.Test;

public class TC03_Profile extends Baseclass
{
    @Test
    public void profilePicture()
    {
        LoginPage lp = new LoginPage(driver);
        ProfilePage pp = new ProfilePage(driver);
        driver.get(baseURL);
        lp.enterUsername();
        lp.enterPassword();
        lp.clickLogin();
        lp.clickprofile();
        pp.uploadProfilePic();

    }
}
