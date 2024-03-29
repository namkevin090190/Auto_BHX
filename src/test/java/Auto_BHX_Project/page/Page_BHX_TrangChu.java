package Auto_BHX_Project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page_BHX_TrangChu {

    private WebDriver driver;

    private By box_Search =  By.cssSelector("#text-search");
    private By text_Login_vne = By.cssSelector("a[title='Đăng nhập']");

    public Page_BHX_TrangChu(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickBoxSearch() {
        WebElement box_Search_Ele = driver.findElement(text_Login_vne);
        if (box_Search_Ele.isDisplayed()) {
            box_Search_Ele.click();
        } else {
            System.out.println("No see the box Search");
        }
    }


}
