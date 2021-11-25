package PageObjects;

import elementMapper.ProgramsElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProgramsPage extends ProgramsElementMapper {

    public ProgramsPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickCreateProgramBtn(){
        buttonCreateProgram.click();
    }

    public String getTextPrograms(){
        return programsTitle.getText();
    }

    public boolean isProgramsPage(){
        return getTextPrograms().equals("Programas");
    }

}
