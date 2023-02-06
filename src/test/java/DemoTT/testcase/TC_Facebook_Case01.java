package DemoTT.testcase;

import DemoTT.base.Setup;
import DemoTT.page.Page_Nam_Facebook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;

public class TC_Facebook_Case01 extends Setup {

    private WebDriver driver;

    Page_Nam_Facebook page_nam_facebook;

    @BeforeClass
    public void setup() {
        driver = getDriver();
    }

    @Parameters({"email","pass"})
    @Test
    public void TC_LoginFacebook (String email, String pass) throws Exception {
        page_nam_facebook = new Page_Nam_Facebook(driver);
        System.out.println("bắt đầu login facebook");
        page_nam_facebook.LoginFacebook(email,pass);
        System.out.println("kết thúc login facebook");
        //page_nam_facebook.VerifyNameFacebook();
        System.out.println("login facebook thành công");
        page_nam_facebook.OpenFanPage();
    }
}
