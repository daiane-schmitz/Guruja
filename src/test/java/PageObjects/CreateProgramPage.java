package PageObjects;

import elementMapper.CreateProgramElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateProgramPage extends CreateProgramElementMapper {

    public CreateProgramPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getTextCreateProgram(){
        return createProgramTitle.getText();
    }

    public boolean isCreateProgramPage(){
        return getTextCreateProgram().equals("Criar Programa");
    }

    public void fillProgramTitle(){
        programTitle.sendKeys("Título automação 2");
    }

    public void setPrivated(){
        privated.click();
    }

    public void fillYear(){
        year.sendKeys("2010");
    }

    public void fillDiscipline(){
        discipline.sendKeys("Direito Eleitoral");
    }

    public void setPosEdital(){
        posEdital.click();
    }

    public void selectArea(){
        area.click();
        fiscalArea.click();
    }

    public void selectLevel(){
        level.click();
        expertLevel.click();
    }

    public void selectPublishingCompany(){
        publishingCompany.click();
        othersPublishingCompany.click();
    }

    public void fillActivity(){
        activity.sendKeys("8");
    }

    public void fillScope(){
        scope.sendKeys("Teste");
    }

    public void clickFinished(){
        isFinished.click();
    }

    public void clickSaveProgram(){
        btnSaveProgram.click();
    }

}
