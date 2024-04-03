import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GuestInfoScreen {

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etFirstName")
    WebElement txtFirstName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etLastName")
    WebElement txtLastName;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etEmail")
    WebElement txtEmail;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")
    WebElement btnSelectCountry;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")
    WebElement btnSelectState;

    @FindBy(id = "android:id/text1")
    List<WebElement> btnCountryOrState;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")
    WebElement txtCompanyName;

    @FindBy(id ="com.nopstation.nopcommerce.nopstationcart:id/etCity" )
    WebElement txtCity;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")
    WebElement txtStreetAddress;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/etZipCode")
    WebElement txtZip;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/btnContinue")
    WebElement btnContinue;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/tvShippingMethodName")
    List<WebElement> btnShippingMethod;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodName")
    List<WebElement> btnPaymentMethod;

    @FindBy(id = "com.nopstation.nopcommerce.nopstationcart:id/checkoutButton")
    WebElement btnCheckOut;

    AndroidDriver driver;

    public  GuestInfoScreen(AndroidDriver driver){
        this.driver =driver;
        PageFactory.initElements( new AppiumFieldDecorator(driver) ,this);
    }

    public String guestCheckOut(){
        txtFirstName.sendKeys("Test");
        txtLastName.sendKeys("User73");
        txtEmail.sendKeys("testuser63@test.com");
        btnSelectCountry.click();
        btnCountryOrState.get(1).click(); //select Country
        btnSelectState.click();
        btnCountryOrState.get(1).click(); //select state
        txtCompanyName.sendKeys("IT Solutions");
        txtCity.sendKeys("NewYork");
        txtStreetAddress.sendKeys("Test Road");
        Utils.swipe(driver,722, 2631,722,662);
        txtZip.sendKeys("1000");
        btnContinue.click();

        btnShippingMethod.get(3).click();
        Utils.swipe(driver,722, 2631,722,662);
        btnContinue.click();

        btnPaymentMethod.get(0).click();

        for(int i=0;i<=4;i++){
            Utils.swipe(driver,668, 2720,668,638);
        }
        btnContinue.click();
        driver.findElement(By.xpath("//android.widget.Button[@text=\"Next\"]")).click();
        btnCheckOut.click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"eu-cookie-ok\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Print\"]")).click();

        WebElement txtMessage = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message"));

        return txtMessage.getText();
    }
}
