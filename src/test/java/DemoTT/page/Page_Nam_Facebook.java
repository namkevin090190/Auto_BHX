package DemoTT.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

public class Page_Nam_Facebook {

    private WebDriver driver;

    private By box_Email =  By.cssSelector("#email");
    private By box_Password = By.cssSelector("#pass");
    private By btn_Login = By.cssSelector("#u_0_5_ym");
    private By name_Facebook = By.xpath("//span[contains(text(),'Nam Hoàng Võ')]");
    private By box_AddStatus = By.xpath("//span[contains(text(),'Bạn viết gì đi...')]");
    private By btn_SubmitStatus = By.cssSelector("div[aria-label='Đăng'] span[class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']");


    public Page_Nam_Facebook(WebDriver driver) {
        this.driver = driver;
    }

    // Click box email & sendkey theo biến nhập vào là biến email
    public void InputEmail (String email) {
        WebElement box_Email_Ele = driver.findElement(box_Email);
        box_Email_Ele.click();
        box_Email_Ele.sendKeys(email);
    }

    // Click box pass & sendkey theo biến nhập vào là biến pass
    public void InputPass (String pass) {
        WebElement box_Pass_ele = driver.findElement(box_Password);
        box_Pass_ele.click();
        box_Pass_ele.sendKeys(pass);
        box_Pass_ele.submit();
//        ChromeOptions ops = new ChromeOptions();
//        ops.addArguments("--disable-notifications");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("(//*[name()='path'][@class='xe3v8dz'])[1]")).sendKeys(Keys.CONTROL +"t");

    }

    public void LoginFacebook (String email, String pass) {
        InputEmail(email);
        InputPass(pass);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //System.out.println("click ko gửi thông báo");
        //driver.switchTo().alert().dismiss();
        //ClickLoginBtn();
    }

    public void VerifyNameFacebook () {
        WebElement name_Facebook_Ele = driver.findElement(name_Facebook);
        Assert.assertTrue(name_Facebook_Ele.isDisplayed(),"Không tìm thấy field Tên Facebook");
    }




    public void OpenFanPage () throws Exception {
        System.out.println("chuyển qua fanpage");
        //driver.findElement(By.xpath("(//*[name()='path'][@class='xe3v8dz'])[1]")).sendKeys(Keys.CONTROL +"t");
//        ChromeOptions ops = new ChromeOptions();
//        ops.addArguments("--disable-notifications");
        //WebDriver driver = new ChromeDriver(ops);
        Thread.sleep(5000);
        driver.get("https://www.facebook.com/groups/553651608918495/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
        //action.sendKeys(Keys.ESCAPE).perform();
        System.out.println("chuyển qua fanpage thành công");
        //driver.switchTo().window(0);
        System.out.println("click button add status");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        WebElement box_AddStatus_Ele = driver.findElement(box_AddStatus);
        Assert.assertTrue(box_AddStatus_Ele.isDisplayed(),"Không tìm thấy box Add status");
        System.out.println("click button add status");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        box_AddStatus_Ele.click();
        System.out.println("click xong sendkey đơn giản");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        box_AddStatus_Ele.sendKeys("Bếp Nhà Gạo");
        System.out.println("sendkey thành công");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        WebElement btn_SubmitStatus_Ele = driver.findElement(btn_SubmitStatus);
        Assert.assertTrue(btn_SubmitStatus_Ele.isDisplayed(),"Không tìm thấy button đăng status");
        btn_SubmitStatus_Ele.click();
//        box_AddStatus_Ele.sendKeys("Toà S5.02 - Bếp Nhà Gạo\n +
//                "\uD83D\uDCF10837040436(Zalo)\n" +
//                "\uD83D\uDEF5 Freeship VHG (SHIP NGOÀI CƯỚC THEO DVVC)\n" +
//                "Hạt dẻ THƠM - NGỌT - BÙI ăn là ghiền. KHÔNG NGON KHÔNG LẤY TIỀN bao hàng 98-99% sàng lọc hư sượng, sâu hỏng từng hạt nhé khách \uD83C\uDF30⚠️\uD83C\uDF30 (Cam kết bù, trả hàng hoàn tiền nếu phát hiện hư sượng ạ)\n" +
//                "✅ Size vừa 7-9 hạt/100gr\n" +
//                "\uD83C\uDF30Hạt dẻ rang 99.000/1kg (cứa sẵn)\n" +
//                "\uD83C\uDF30\uD83C\uDF30 Hạt dẻ hấp 89.000/1kg (cứa sẵn)\n" +
//                "\uD83C\uDF30\uD83C\uDF30\uD83C\uDF30 Hạt dẻ tươi 79.000/1kg (cứa sẵn + 5k/1kg)\n" +
//                "✅ Size to đùng 5-7 hạt/100gr\n" +
//                "\uD83C\uDF30 Hạt dẻ rang 119.000/1kg (cứa sẵn)\n" +
//                "\uD83C\uDF30\uD83C\uDF30 Hạt dẻ hấp 109.000/1kg (cứa sẵn)\n" +
//                "\uD83C\uDF30\uD83C\uDF30\uD83C\uDF30 Hạt dẻ tươi 89.000/1kg (cứa sẵn + 5k/1kg)\n" +
//                "\uD83D\uDC49\uD83C\uDFFC\uD83D\uDC49\uD83C\uDFFC\uD83D\uDC49\uD83C\uDFFC Ăn một hạt là đáng một hột luôn \uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\n" +
//                "#hạtdẻ #hạtdẻtươi #hạtdẻrang #hạtdẻhấp #freeshipvin #vinhomesgrandpark\n" +
//                "\uD83D\uDE47\uD83C\uDFFB\u200D♀️ Cảm ơn Ad phê duyệt \uD83D\uDE47\uD83C\uDFFB\u200D♀");

    }
}
