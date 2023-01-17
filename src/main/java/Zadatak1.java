import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ITBOOTCAMP\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box/");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Vesna");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("vesna.knezevic997@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Novosadska");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Bulevar Oslobodjenja");

        driver.manage().window().maximize();

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div"));
        buttonSubmit.click();

        WebElement nameOutput = driver.findElement(By.id("name"));
        WebElement emailOutput = driver.findElement(By.id("email"));

        System.out.println(fullName.getAttribute("value"));
        System.out.println(nameOutput.getText().substring(5));

        System.out.println(email.getAttribute("value"));
        System.out.println(emailOutput.getText().substring(6));

        if (fullName.getAttribute("value").equalsIgnoreCase(nameOutput.getText().substring(5)) && email.getAttribute("value").equalsIgnoreCase(emailOutput.getText().substring(6))) {
            System.out.println("Ime i email se poklapaju.");
        } else {
            System.out.println("Ime i email se ne poklapaju.");
        }


        driver.quit();

    }
}
