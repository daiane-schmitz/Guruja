package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProgramElementMapper {

    @FindBy(css = "div > h2")
    public WebElement createProgramTitle;

    @FindBy(id = "program-title")
    public WebElement programTitle;

    @FindBy(css = "form > div:nth-child(2) > div.FormRow-sc-1im3xby-0.eRrLSC > div:nth-child(2) > div > label")
    public WebElement privated;

    @FindBy(id = "disciplineId")
    public WebElement discipline;

    @FindBy(id = "discipline-year")
    public WebElement year;

    @FindBy(css = "div:nth-child(3) > div.FormRow-sc-1im3xby-0.eRrLSC > div:nth-child(2) > div > label")
    public WebElement posEdital;

    @FindBy(css = "div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > section > button")
    public WebElement area;

    @FindBy(id = "area-option-1")
    public WebElement fiscalArea;

    @FindBy(css = "div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > section > button")
    public WebElement level;

    @FindBy(id = "level-option-1")
    public WebElement expertLevel;

    @FindBy(css = "div:nth-child(2) > div:nth-child(1) > section > button")
        public WebElement publishingCompany;

    @FindBy(id = "editor-option-4")
    public WebElement othersPublishingCompany;

    @FindBy(id = "activity")
    public WebElement activity;

    @FindBy(id = "scope")
    public WebElement scope;

    @FindBy(css = "label.styles__FakeCheckbox-sc-197gkb2-2.jzdBKK")
    public WebElement isFinished;

    @FindBy(css = "footer > div > button")
    public WebElement btnSaveProgram;

}
