package com.facebook.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class Homepage
{

    WebDriver ldriver;
    public Homepage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchbar;
    @FindBy(xpath = "//span[contains(text(),'Zoop.One')]")
    WebElement actualsearchresult;


    public void VerifySearch()
    {
        searchbar.sendKeys("zoop.one");
        searchbar.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(ldriver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Zoop.One')]")));
        String actualsearchresultText = actualsearchresult.getText();
        assertTrue(actualsearchresultText.contains("zoop"));

    }


}
