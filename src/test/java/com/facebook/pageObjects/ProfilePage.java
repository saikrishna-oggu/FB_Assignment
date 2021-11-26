package com.facebook.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage
{
    WebDriver ldriver;
    public ProfilePage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//div[@aria-label='Update profile picture']")
    WebElement clickprofilepicture;

    @FindBy(xpath = "//span[contains(text(),'Upload Photo')]")
    WebElement clickuploadphoto;

    public void uploadProfilePic()
    {
        clickprofilepicture.click();
        clickuploadphoto.click();
        WebElement UploadImg = ldriver.findElement(By.xpath("//span[contains(text(),'Upload Photo')]"));
        UploadImg.sendKeys("D:\\Facebook_Assignment\\src\\test\\java\\testData\\test image.jpg");
    }

}
