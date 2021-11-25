package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMapper {

    @FindBy(css = "input:nth-child(1)")
    public WebElement email;

    @FindBy(css = " input:nth-child(2)")
    public WebElement password;

    @FindBy(css = "div > button")
    public WebElement buttonEnter;
}
