import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner  extends Setup{

    @Test(priority = 1, description = "Select Product")
    public void searchProduct() throws InterruptedException {
        ProductScreen productScreen =new ProductScreen(driver);
        productScreen.selectProduct();

        Allure.description("Product Selected Successfully");
    }

    @Test(priority = 2, description = "Checkout Product")
    public void checkOutProduct(){
        GuestInfoScreen guestInfoScreen =new GuestInfoScreen(driver);

        String actualMessage = guestInfoScreen.guestCheckOut();

        String expectedMessage ="Your order has been successfully processed!";
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.contains(expectedMessage));

        Allure.description("Product Ordered Successfully");
    }
}
