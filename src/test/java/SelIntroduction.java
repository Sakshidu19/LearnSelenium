import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class SelIntroduction {
    public static void main(String[] args) {

        //Invoking Browser
        // Chrome - ChromeDriver exten --> Methods close get
        // Firefox - firefoxDriver --> Methods close get
        // Safari - SafariDriver --> Methods close get
        // WebDriver close get
        // WebDriver methods + class browser

        // ChromeDriver.exe --> Chrome browser

        /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saksh\\OneDrive\\Desktop\\chromedriver_win32.exe");

        // webdriver.chrome.driver --> value of path
*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://docs.oracle.com/en/java/javase/17/docs/api/jdk.incubator.vector/jdk/incubator/vector/Vector.html");
        System.out.println(driver.getTitle());

    }
}
