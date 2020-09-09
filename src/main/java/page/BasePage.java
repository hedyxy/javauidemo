package page;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    //获取输入的元素
    static WebElement find(By locator){
        return Driver.getCurrentDriver().findElement(locator);
    }


    //判断是xpath还是id
    static By locate(String locator){
        if (locator.matches("/.*")){
            return By.xpath(locator);
        }else{
            return By.id(locator);
        }
    }


    static By text(String content){
        return By.xpath("//*[text='"+content+"']");
    }

    static By className(String contentclass){
        return By.className(contentclass);
    }

}
