package Test_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ILAB_HomePage {

    private WebDriver driver;
    private String ILABURL = "https://www.ilabquality.com/";

    public void ILAB_HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
        driver.get(ILABURL);
    }
}
