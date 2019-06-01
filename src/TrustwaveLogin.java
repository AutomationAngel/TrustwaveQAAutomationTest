import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TrustwaveLogin {

    public static void loginMain (){

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("E:\\Projects\\Tutorials\\LearningJava\\TrustwaveQaTest\\src\\globals.properties");
        prop.load(fis);

        System.setProperty(prop.getProperty("browserDriver"), prop.getProperty("driverLoc"));
        WebDriver driver=new ChromeDriver();
        driver.get(prop.getProperty("url"));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.name("username")).sendKeys(prop.getProperty("customerName"));

        driver.findElement(By.name("passwd")).sendKeys(prop.getProperty("custPassword"));

        driver.findElement(By.name("login_btn")).click();




    }
}
