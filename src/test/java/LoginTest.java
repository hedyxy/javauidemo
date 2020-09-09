import net.sf.cglib.asm.$AnnotationVisitor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;


import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    static  MainPage mainPage;
    static ProfilePage profilePage;
    @BeforeAll
    static void beforeAll(){
        mainPage=MainPage.start();
        profilePage=mainPage.gotoProfile();
    }

//    @ParameterizedTest
//    @CsvSource({
//            "18500060881,1234"
//    })
//    public void faileLoginTest(String username,String password){
//
//        LoginPage loginPage = profilePage.gotoLoginPage();
//        LoginPage loginPage1 = loginPage.PasswordFaile(username,password);
////        System.out.println(loginPage.getMessage());
//    }

    @ParameterizedTest
    @CsvSource({
            "18500060881,qwer1234"
    })
    public void susseceLoginTest(String username,String password){
        LoginPage loginPage = profilePage.gotoLoginPage();
        MainPage mainPage1 = loginPage.passwordSucessLogin(username,password);
//        assertThat(MainPage mainPage1 instanceof MainPage);


    }


}
