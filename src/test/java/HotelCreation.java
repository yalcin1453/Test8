import Test8.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelCreation extends TestBase{
    @Test
    public void hotelCreation() throws InterruptedException {
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();

        WebElement hotelManagement = driver.findElement(By.linkText("Hotel Management"));
        hotelManagement.click();
        WebElement hotelList = driver.findElement(By.partialLinkText("Hotel List"));
        hotelList.click();
        Thread.sleep(5000);
        WebElement addHotel = driver.findElement(By.linkText("ADD HOTEL"));
        addHotel.click();
        Thread.sleep(5000);
        WebElement code = driver.findElement(By.id("Code"));
        code.sendKeys("1111");
        WebElement name = driver.findElement(By.id("Name"));
        name.sendKeys("Best Arlington Hotel");
        WebElement address = driver.findElement(By.id("Address"));
        address.sendKeys("123 Trader dr. Houston,Tx 45678");
        WebElement phone = driver.findElement(By.id("Phone"));
        phone.sendKeys("123-456-7890");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("BestArlingtonHotel123@gmail.com");
        WebElement idGroup = driver.findElement(By.id("IDGroup"));
        Select option = new Select(idGroup);
        option.selectByValue("2");
        WebElement saveButton = driver.findElement(By.id("btnSubmit"));
        saveButton.click();
        Thread.sleep(5000);
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='bootbox-body']"));
        String successMessageText=successMessage.getText();
        Assert.assertEquals(successMessageText,"Hotel was inserted successfully");
        WebElement okButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        okButton.click();


    }
}
