import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        System.out.println(driver.findElement(By.xpath("//p")).getText());
        try {
            Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.\n" + "\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
