package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver)
    {
        //super(driver);
        //initialization
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userPassword")
    WebElement passwordEle;

    @FindBy(id="login")
    WebElement submit;
    @FindBy(css="[class*='flyInOut']")
    WebElement errorMessage;

    public void loginApplication(String email,String password)
    {
        userEmail.sendKeys(email);
        passwordEle.sendKeys(password);
        submit.click();
    }
//
//    public String getErrorMessage()
//    {
//        waitForWebElementToAppear(errorMessage);
//        return errorMessage.getText();
//    }

    public void goTo()
    {
        driver.get("https://rahulshettyacademy.com/client");
    }
}
