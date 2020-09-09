package page;

import driver.Driver;
import org.openqa.selenium.By;

public class ProfilePage {
    By login =By.id("com.mfw.roadbook:id/loginLayout");//从首页点击登陆
    public LoginPage gotoLoginPage(){
        Driver.getCurrentDriver().findElement(login).click();
        return new LoginPage();
    }
}
