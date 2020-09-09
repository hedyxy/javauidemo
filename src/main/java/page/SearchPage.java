package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage search(String keyword){
        find(By.id("com.mfw.roadbook:id/search_bar_edit")).sendKeys(keyword);
        find(By.id("com.mfw.roadbook:id/searchTv")).click();
        return this;
    }

    public MainPage Cancel(){
        find(By.id("com.mfw.roadbook:id/back_btn")).click();
        return new MainPage();
    }

    public List<String> getAll(){
        ArrayList<String> arrayList = new ArrayList<String>();
        for(WebElement e: Driver.getCurrentDriver().findElements(By.id("com.mfw.roadbook:id/title")))
            arrayList.add(e.getText());
        return arrayList;
    }


}
