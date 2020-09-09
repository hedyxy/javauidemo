package page;

import driver.Driver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    By numlogin = locate("com.mfw.roadbook:id/tvPhoneLogin");//登陆页面，点击验证码登陆
    By chatlogin =locate("com.mfw.roadbook:id/iconWechat");//登陆页面，选微信登陆
    By userName = locate("com.mfw.roadbook:id/etAccount");//登陆页面的username框
    By pwd=locate("com.mfw.roadbook:id/etPwd");//登陆页面的password框
    By login=locate("com.mfw.roadbook:id/submitText");//登陆页面的登陆按钮
    By toast = text("用户名或者密码错误！");//获取提示toast

    String message;

    //登陆失败
    public LoginPage PasswordFaile(String username,String password){
        //输入用户名
        find(userName).sendKeys(username);
        //输入密码
        find(pwd).sendKeys(password);
        find(login).click();
//        message = find(toast).getText();
        return this;
    }

    public String getMessage(){
        return message;
    }

    //正常登陆
    public MainPage passwordSucessLogin(String username,String password){
        //输入用户名
        find(userName).sendKeys(username);
        //输入密码
        find(pwd).sendKeys(password);
        find(login).click();
        return new MainPage();

    }

}
