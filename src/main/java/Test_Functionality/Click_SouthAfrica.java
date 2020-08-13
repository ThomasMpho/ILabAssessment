package Test_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Click_SouthAfrica {

    private WebDriver driver;

    @FindBy(xpath = "(//a[@href='https://www.ilabquality.com/careers/'])[1]")
    private WebElement careers;
    @FindBy(xpath = "//a[@href='/careers/south-africa/']")
    private WebElement SouthAfrica;

    public void setCareers() {

        careers.click();
    }

    public void setSouthAfrica(){

        SouthAfrica.click();
    }

}
