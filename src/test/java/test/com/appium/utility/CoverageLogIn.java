package test.com.appium.utility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoverageLogIn {


    public static void logIn (AppiumDriver<WebElement> driver, WebDriverWait wait, WaitAnd waitAnd) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.contacts:id/add_account_button")));
        driver.findElement(By.id("com.android.contacts:id/add_account_button")).click();
        waitAnd.click(WidgetPath.INSTANCE.getUserNameField());
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,414][640,490]']")).sendKeys("test@yopmail.com");
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@bounds='[80,554][640,631]']")).sendKeys("test123!");
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[80,709][120,749]']")).click();
       
    }
 }

