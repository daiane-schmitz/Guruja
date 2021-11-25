package PageObjects;

import elementMapper.HomeElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomeElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickProgramsBtn(){
        buttonPrograms.click();
    }
}
