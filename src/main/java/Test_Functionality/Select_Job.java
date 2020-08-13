package Test_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Select_Job {

    private WebDriver driver;

    @FindBy(xpath = "(//a[@class='wpjb-job_title wpjb-title'])[1]")
    private WebElement Job;
    @FindBy(xpath = "//a[@data-wpjb-form='wpjb-form-job-apply']")
    private WebElement Applay_Online;

    @FindBy(xpath = "//input[@name='applicant_name']")
    private WebElement name;
    @FindBy(xpath = "//input[contains(@name,'email')]")
    private WebElement email;
    @FindBy(xpath = "//input[contains(@name,'phone')]")
    private WebElement phone;

    @FindBy(xpath = "//input[contains(@value,'Send Application')]")
    private WebElement sendApplication;

    public void setJob(){

        Job.click();
    }

    public void setApplay_Online(){

        Applay_Online.click();
    }

    public void setName(String Name){

        name.sendKeys(Name);
    }

    public void setEmail(String Email_Address){

        email.sendKeys(Email_Address);
    }

    public void setPhone(String Phone_No){

        phone.sendKeys(Phone_No);
    }

    public void setSendApplication() {
        sendApplication.click();
    }
}
