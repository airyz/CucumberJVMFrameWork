package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Eraclis Hadjiarapis on 2/1/2017.
 */
public class SignupPage {
    WebDriver driver;
    @FindBy(id = "user_first_name")
    private WebElement firstNameTextBox;
    @FindBy(id = "user_last_name")
    private WebElement lastNameTextBox;
    @FindBy(id = "user_email")
    private WebElement emailTextBox;
    @FindBy(id = "user_password")
    private WebElement passwordTextBox;
    @FindBy(id = "user_password_confirmation")
    private WebElement confirmPasswordTextBox;
    @FindBy(name = "commit")
    private WebElement signupButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_first_name")));
        firstNameTextBox.sendKeys(firstName);
    }
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        lastNameTextBox.sendKeys(lastName);
    }

    public void she_provides_the_email_as(String email) throws Throwable {
        emailTextBox.sendKeys(email);
    }
    public void she_provides_the_password_as(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }
    public void she_signs_up() throws Throwable {
        signupButton.click();
    }

}
