package testBestBuy;

import mainBestBuy.FeaturedItems;
import org.testng.annotations.Test;

public class TestFeaturedItems extends FeaturedItems{
    @Test
    public void testFeaturedItems() throws InterruptedException {
        featuredItemsList();
    }
}

