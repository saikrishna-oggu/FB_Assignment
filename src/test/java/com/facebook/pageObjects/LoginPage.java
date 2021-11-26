package com.facebook.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPage
{

    WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement txtUsername;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement textPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbtn;

    @FindBy(xpath = "//*[contains(@class,'g5ia77u1 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 j83agx80 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys d1544ag0 qt6c0cv9')]")
    WebElement profilelink;
    @FindBy (xpath = "//h1[@class='gmql0nx0 l94mrbxd p1ri9a11 lzcic4wl']")
    WebElement getTxtUsername;

    @FindBy(xpath = "//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")
    WebElement createaccountbtn;

    @FindBy(xpath = "//div[contains(@class,'mbs _52lq fsl fwb fcb')]")
    WebElement eleidisplayed;

    @FindBy(xpath = "//div[@id='u_1_a_A4']//i[@class='_5dbc img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement firstnameError;
    @FindBy(xpath = "//div[@id='u_1_c_l1']//i[@class='_5dbc img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement surnameError;
    @FindBy(xpath = "//div[@id='u_1_f_7w']//i[@class='_5dbc img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement mobileError;

    @FindBy (xpath = "//*[@id=\"u_1_k_uQ\"]/i[1]")
    WebElement emailvalidationmesage;
    @FindBy(xpath = "//div[@id='u_1_k_uQ']//i[@class='_5dbc img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement passwordError;
    @FindBy(xpath = "//div[@id='birthday_wrapper']//i[@class='_5dbc _5k_6 img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement dobError;
    @FindBy(xpath = "//i[@class='_5dbc _8esb img sp_98fCI7IVTTz_1_5x sx_e1ddd6']")
    WebElement genderError;
    @FindBy(xpath = "//*[@type='submit' and @name= 'websubmit']")
    WebElement signupbtn;
    @FindBy(xpath = "//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")
    WebElement firstnametxt;
    @FindBy (xpath = "//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']")
    WebElement surnametxt;
    @FindBy (xpath = "//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']")
    WebElement emailtxt;
    @FindBy (xpath = "//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email_confirmation__']")
    WebElement reenteremailtxt;
    @FindBy (xpath = "//input[@class='inputtext _58mg _5dba _2ph-' and @data-type='password']")
    WebElement passwordtxt;
    @FindBy(xpath = "//*[@id=\"day\"]")
    WebElement daydropdown;
    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement monthdropdown;
    @FindBy(xpath = "//*[@id=\"year\"]")
    WebElement yeardropdown;
    @FindBy (xpath = "//input[@type='radio' and @name='sex' and @value='1']")
    WebElement genderradiobtn;

    public void enterUsername ()
    {
        txtUsername.sendKeys("testmytfc@gmail.com");
    }

    public void enterPassword ()
    {
        textPassword.sendKeys("Nopassword@2");
    }

    public void clickLogin()
    {
        loginbtn.click();

    }
    public void clickprofile()
    {
        profilelink.click();

    }
    public void verifyTxtUsername()
    {
        String Actualusername = getTxtUsername.getText();
        assertTrue(Actualusername.contains("Tester Rbt"));

    }

    public void clickCreatAccountbtn ()
    {
        createaccountbtn.click();
    }

    public void VerifySignupText()
    {
        eleidisplayed.isDisplayed();
    }

    public void verifyErrorMessages()
    {
        signupbtn.click();
        String myWindowHandle = ldriver.getWindowHandle();
        ldriver.switchTo().window(myWindowHandle);
        //firstnameError.isDisplayed();
        mobileError.sendKeys("test");
        emailvalidationmesage.isDisplayed();
        surnameError.isDisplayed();
        mobileError.isDisplayed();
        dobError.isDisplayed();
        genderError.isDisplayed();

    }

    public void enterValidDetails()
    {
        firstnametxt.sendKeys("test");
        surnametxt.sendKeys("test");
        emailtxt.sendKeys("testmytfc@gmail.com");
        reenteremailtxt.sendKeys("testmytfc@gmail.com");
        passwordtxt.sendKeys("Nopassword@2");
        Select daydd = new Select(daydropdown);
        daydd.selectByIndex(1);
        Select monthdd= new Select(monthdropdown);
        monthdd.selectByIndex(1);
        Select yeardd = new Select(yeardropdown);
        yeardd.selectByIndex(1);
        genderradiobtn.click();
        signupbtn.click();
    }

    public void enterInValidDetails()
    {
        firstnametxt.sendKeys("test");
        surnametxt.sendKeys("test");
        emailtxt.sendKeys("testmytfc@gmail.com");
        reenteremailtxt.sendKeys("testmytfc@gmail.com");
        passwordtxt.sendKeys("Nopassword@2");
        genderradiobtn.click();
        signupbtn.click();
    }

}
