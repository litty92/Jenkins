import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.ExcelUtils;

public class Login {

    public static void loginFn() throws Exception {


        //SignIn - taking values from the excel
        String []value = SignIn.Execute();
        String sUsername = value[0];
        String sPassword = value[1];
        String sURL = value[2];

        // launch Chrome and direct it to the Base URL
        WebDriver driver = new ChromeDriver();

        driver.get(sURL);
        driver.manage().window().maximize();

        //enter value to the username and password
        String Username = ExcelUtils.getCell("Sheet1","Username",2);
        String Password = ExcelUtils.getCell("Sheet1","Password", 2);
        System.out.println("Test");
        System.out.println("Test");

    }

}
