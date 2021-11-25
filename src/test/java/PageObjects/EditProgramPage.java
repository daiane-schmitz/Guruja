package PageObjects;

import elementMapper.EditProgramElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class EditProgramPage extends EditProgramElementMapper {

    public EditProgramPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getMaterialsText(){
        return materialsText.getText();
    }

    public boolean isEditProgramPage(){
        return getMaterialsText().equals("Materiais");
    }

    public void selectOthersPublishingCompany(){
        selectPublishingCompany.click();
        othersPublishingCompany.click();
    }

    public void fillMaterialTitle(){
        materialTitle.sendKeys("Teste Automação");
    }

    public void fillMaterialLink(){
        materialLink.sendKeys("https://trin.ca/");
    }

    public void addMaterial(){
        btnAddMaterial.click();
    }

    public String getMaterialAddedText(){
        return materialAdded.getText();
    }

    public boolean isMaterialAdded(){
        return getMaterialAddedText().equals("Teste Automação");
    }

    public void clickAddActivityBtn(){
        btnAddActivity.click();
    }

}
