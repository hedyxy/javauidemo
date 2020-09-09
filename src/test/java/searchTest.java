import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;
import page.SearchPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class searchTest {
    static  MainPage mainPage;
    static SearchPage searchPage;
    @BeforeAll
    static void beforeAll() {
        mainPage = MainPage.start();
        searchPage = mainPage.gotoSearch();
    }
    @ParameterizedTest
    @CsvSource({
            "马尔代夫,攻略",
            "北海道,攻略"
    })
    public void searchTest(String keyword,String expend){
         String content = searchPage.search(keyword).getAll().get(0);
         assertThat(content,equalTo(expend));
         assertThat(content,notNullValue());
    }
}
