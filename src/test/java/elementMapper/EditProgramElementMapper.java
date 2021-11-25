package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProgramElementMapper {

    @FindBy(css = "div.styles__Wrapper-sc-i4ayat-0.ewNYsr > h3")
    public WebElement materialsText;

    @FindBy(css = "div.FormRow-sc-1im3xby-0.jWYLDS > div:nth-child(1) > section > button")
    public WebElement selectPublishingCompany;

    @FindBy(id = "material-editor-option-4")
    public WebElement othersPublishingCompany;

    @FindBy(id = "material-title")
    public WebElement materialTitle;

    @FindBy(id = "material-link")
    public WebElement materialLink;

    @FindBy(css = "div.FormRow-sc-1im3xby-0.fOvhwh > div:nth-child(2) > button")
    public WebElement btnAddMaterial;

    @FindBy(css = "div > h5")
    public WebElement materialAdded;

    @FindBy(css = "div.styles__SubtitleWrap-sc-1rv17dg-1.gafxBV > a")
    public WebElement btnAddActivity;
}
