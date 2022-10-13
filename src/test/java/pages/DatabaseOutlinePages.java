package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatabaseOutlinePages {
    public DatabaseOutlinePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@type='button']")
    public WebElement newButton;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='sorting_1']")
    public WebElement isimVar;



}
