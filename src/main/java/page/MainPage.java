package page;

import driver.Driver;
import org.openqa.selenium.By;


public class MainPage extends BasePage {
    By profile=By.id("com.mfw.roadbook:id/homeFl");


    public static MainPage start(){
        Driver.start();
        return new MainPage();
    }

    public ProfilePage gotoProfile(){
        Driver.getCurrentDriver().findElement(profile).click();
        return new ProfilePage();
    }

    public SearchPage gotoSearch(){
        //点击搜索框
        find(By.id("com.mfw.roadbook:id/searchLayout")).click();
        return new SearchPage();
    }


}
