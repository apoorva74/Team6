package mainBestBuy;

import base.CommonAPI;

public class HomePage extends CommonAPI{
    public void homepage() throws InterruptedException {
        //Testing scrollbar - scrolling down
        sleep();
        scrollDown();
        sleep();
        scrollDown();
        sleep();
        scrollDown();
        sleep();
        scrollDown();
        sleep();
        scrollDown();
        sleep();
        scrollDown();
        sleep();
        scrollDown();

        //Testing scrollbar - Scrolling up
        sleep();
        scrollUp();
        sleep();
        scrollUp();
        sleep();
        scrollUp();
        sleep();
        scrollUp();
        sleep();
        scrollUp();
        sleep();
        scrollUp();
        sleep();
        scrollUp();
    }
}
