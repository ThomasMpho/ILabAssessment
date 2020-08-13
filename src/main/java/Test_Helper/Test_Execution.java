package Test_Helper;

import Test_Functionality.Click_SouthAfrica;
import Test_Functionality.ILAB_HomePage;
import Test_Functionality.Select_Job;
import com.aventstack.extentreports.ExtentTest;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class Test_Execution {

    private static WebDriver driver;
    private String ExcelPath = "C:\\Users\\MA40010218\\IdeaProjects\\QuotesCreation\\src\\main\\java\\Test_Data\\ILab_Test_Data.xlsx";
    private ExtentTest test;

    @BeforeTest
    public void setup()
    {
        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            System.out.println("**Chrome driver initiated**");
        }

        else {
            System.out.println("**Chrome driver already initiated**");
        }
    }

    public static WebDriver getdriver()
    {
        if (driver == null)
        {
            return driver;
        } else {
            return driver;
        }
    }

    @Test(priority = 1, description = "Launch ILAB Website")
    public void Laucnh_ILAB_Home_Page()
    {
        ILAB_HomePage page = PageFactory.initElements(driver,ILAB_HomePage.class);
        page.ILAB_HomePage(driver);
    }

    @Test(priority = 2, description = "Under Careers select South Africa")
    public void Click_South_Africa()
    {
        Click_SouthAfrica page1 = PageFactory.initElements(driver,Click_SouthAfrica.class);
        page1.setCareers();
        page1.setSouthAfrica();

    }

    @Test(priority = 3, description = "Select “Apply online” button and populate the form")
    public void Apply_For_The_Job()
    {
        Select_Job page2 = PageFactory.initElements(driver,Select_Job.class);
        page2.setJob();

    }

    @Test(priority = 4, description = "select “Apply online” button and populate the form")
    public void Applay_Online()
    {
        Select_Job page02 = PageFactory.initElements(driver,Select_Job.class);
        page02.setApplay_Online();

    }


    @Test(priority = 5, description = "Apply online")
    public void form() throws IOException {

        Select_Job job = PageFactory.initElements(driver,Select_Job.class);

        FileInputStream fis = new FileInputStream(ExcelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int colNo = sheet.getLastRowNum();

        for (int j=1;j<=colNo; j++ )
        {
            String name = sheet.getRow(j).getCell(0).getStringCellValue();
            String email = sheet.getRow(j).getCell(1).getStringCellValue();
            job.setName(""+name);
            job.setEmail(""+email);
        }

        int num1, num2, num3;
        int set2, set3;

        Random generator = new Random();


        num1 = generator.nextInt(7) + 1;
        num2 = generator.nextInt(8);
        num3 = generator.nextInt(8);

        set2 = generator.nextInt(643) + 100;

        set3 = generator.nextInt(8999) + 1000;

        //System.out.println ( "(" + num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3 );

        String num = "(" + num1 + "" + num2 + "" + num3 + ")" + "-" + set2 + "-" + set3 ;
        job.setPhone(num);

        job.setSendApplication();
    }


}
