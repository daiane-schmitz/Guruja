package PageObjects;

import elementMapper.LoginElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("guruja@gmail.com");
    }

    public void fillPassword(){
        password.sendKeys("12345678");
    }

    public void clickButtonEnter(){
        buttonEnter.click();
    }
}
