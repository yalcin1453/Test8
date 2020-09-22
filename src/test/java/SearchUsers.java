import Test8.Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchUsers extends TestBase {


    @Test
    public void login(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement login= driver.findElement(By.linkText("Log in"));
        login.click();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
    }
    @Test
    public void userSearch(){
        login();
        WebElement email= driver.findElement(By.xpath("(//input[@class='form-control form-filter input-sm'])[3]"));
        email.sendKeys("fatih721@gmail");
        WebDriverWait wait= new WebDriverWait(driver,20);
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-search'])[1]")));
        search.click();

       
        



    }





}
