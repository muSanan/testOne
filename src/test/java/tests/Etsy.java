package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.EtsyHomePage;
import utilities.Config;
import utilities.Driver;

public class Etsy {
    EtsyHomePage etsyHomePage = new EtsyHomePage();

    @Test
    public void checkFind(){
        Driver.getDriver().get(Config.getValue("URL"));
        etsyHomePage.searchFind.sendKeys("Bracelet"+ Keys.ENTER);
    }

}
