package testBestBuy;

import mainBestBuy.AllCategories;
import mainBestBuy.PopUpWindow;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAllCategories extends AllCategories {
    @Test
    public void testCategories() throws InterruptedException {
       allCategories();
    }
}
