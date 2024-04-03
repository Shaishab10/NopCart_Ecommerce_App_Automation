import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ProductScreen {

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAccept")
    WebElement btnAcceptAgreement;
    @FindBy(className = "android.widget.ImageView")
    List<WebElement> btnProductIcon;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/ivProductThumb")
    List<WebElement> productsSubItems;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")
    WebElement btnAddToCart;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/counterIcon")
    WebElement btnCounterIcon;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")
    WebElement btnCheckOut;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")
    WebElement btnGuestCheckOut;

    AndroidDriver driver;

    public ProductScreen(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements( new AppiumFieldDecorator(driver) ,this);
    }

    public void selectProduct() throws InterruptedException {
        btnAcceptAgreement.click();

        Thread.sleep(2000);

        Utils.swipe(driver, 1402, 1235, 137, 1247);

        btnProductIcon.get(6).click(); //click on electronics

        Thread.sleep(2000);

        Utils.swipe(driver, 710, 2565, 710, 159);

        productsSubItems.get(1).click(); //click on mattress bedroom

        btnAddToCart.click();
        btnCounterIcon.click();
        btnCheckOut.click();
        btnGuestCheckOut.click();


    }

}
