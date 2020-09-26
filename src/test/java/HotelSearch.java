
import Test8.Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HotelSearch extends TestBase {
    public void clickLogIn (){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement mainPageLogInButton= driver.findElement(By.linkText("Log in"));
        mainPageLogInButton.click();
    }

    @Test
    public void hotelSearch()  {
        clickLogIn();

        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();

        WebElement hotelManagement= driver.findElement(By.linkText("Hotel Management"));
        hotelManagement.click();

        WebElement hotelList= driver.findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
        hotelList.click();


        WebElement IDHotelBox= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        IDHotelBox.sendKeys("4");



        WebElement searchButton= driver.findElement(By.xpath("//button[@class='btn btn-sm yellow filter-submit margin-bottom']"));
        searchButton.click();


    }
}
