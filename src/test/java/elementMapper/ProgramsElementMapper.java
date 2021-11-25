package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramsElementMapper {

    @FindBy(css = " div > h2")
    public WebElement programsTitle;

    @FindBy(css = "div:nth-child(2) > a")
    public WebElement buttonCreateProgram;
}
