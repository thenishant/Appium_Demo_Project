package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class SearchItemTest extends BaseTest {

    SearchItemTest() throws Exception {
    }

    @Test
    private void SearchItem(String itemName) {
        new LoginPage(driver).skipLogin();
    }
}
