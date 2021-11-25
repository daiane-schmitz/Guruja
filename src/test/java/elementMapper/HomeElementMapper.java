package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementMapper {

    @FindBy(css = " a.styles__MenuItem-sc-1rxanxu-2.ctTdiW")
    public WebElement buttonHome;

    @FindBy(css = "a:nth-child(2) > svg")
    public WebElement buttonPrograms;

}
