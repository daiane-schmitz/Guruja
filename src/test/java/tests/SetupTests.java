package tests;

import PageObjects.*;
import elementMapper.EditProgramElementMapper;
import elementMapper.HomeElementMapper;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTests extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
    }

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickButtonEnter();

        //assert da home
    }


    @Test
    public void testGoToProgramPage() {
        HomePage homePage = new HomePage();
        ProgramsPage programsPage = new ProgramsPage();
        CreateProgramPage createProgramPage = new CreateProgramPage();

        testLogin();
        homePage.clickProgramsBtn();
        assertTrue(programsPage.isProgramsPage());
        programsPage.clickCreateProgramBtn();
        //    assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("guruja/programas/criar")));
        assertTrue(createProgramPage.isCreateProgramPage());

    }


    @Test
    public void testCreateProgram() throws InterruptedException {
        CreateProgramPage createProgramPage = new CreateProgramPage();
        EditProgramPage editProgramPage = new EditProgramPage();

        testGoToProgramPage();
        Thread.sleep(8000);
        createProgramPage.fillProgramTitle();
        createProgramPage.setPrivated();
        createProgramPage.fillYear();
        createProgramPage.setPosEdital();
        createProgramPage.fillDiscipline();
        createProgramPage.selectArea();
        createProgramPage.selectLevel();
        createProgramPage.selectPublishingCompany();
        createProgramPage.fillActivity();
        createProgramPage.fillScope();
        createProgramPage.clickFinished();
        createProgramPage.clickSaveProgram();
        assertTrue(editProgramPage.isEditProgramPage());
    }

    @Test
    public void testEditProgram() throws InterruptedException {
        EditProgramPage editProgramPage = new EditProgramPage();

        testCreateProgram();
        editProgramPage.selectOthersPublishingCompany();
        editProgramPage.fillMaterialTitle();
        editProgramPage.fillMaterialLink();
        editProgramPage.addMaterial();
        assertTrue(editProgramPage.isMaterialAdded());
        editProgramPage.clickAddActivityBtn();
    }
}
