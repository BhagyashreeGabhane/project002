import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project002 {
    static WebDriver driver =new ChromeDriver();
    public static void main(String args[]){
        driver.get("https://foodstore-1.web.app/");
        driver.manage().window().maximize();

        //Step1
        //Open a website in browser
         userIsOnWebpage();
         //Step2
        //Click on sign button

         driver.findElement(By.xpath("//html/body/div/header/div[3]/div/a")).click();
          String text=driver.findElement(By.xpath("//h1[text()='Sign in']")).getText();
         if (text.contentEquals("Sign in")) {
             System.out.println("user is on the Sign in page");
         }
         else{
             System.out.println("user is not Sign in  page");
         }

         //Step 3
        //click on join in button
        //User should navigate to " create account page"
        driver.findElement(By.className("join")).click();
         String actualStr=driver.findElement(By.xpath("//h1[text()='Create Account']")).getText();
         String expectedStr ="Create Account";
         //question?
         if(actualStr.contentEquals(expectedStr)){
             System.out.println("user is on the Create Account in page");

         }else {
             System.out.println("user is on the Create Account in page");
         }

         //Step4
        //enter valid email id password and name then click on sign up button
        //user should able to enter data in all field after sign up user should see small icon with login name and sign in option should not present
        driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Bhagyashri");//how we can get data from user?
         driver.findElement(By.xpath("//*[@name='email']")).sendKeys("bhagyagabhane@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Bhagyashri");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

    }

    private static void userIsOnWebpage() {
        String actualtext = driver.findElement(By.className("coverTitle")).getText();
        if (actualtext.contentEquals("You order we deliver")) {
            System.out.println("user is on the home page");
        } else {
            System.out.println("user is not on the home page");
        }
    }
}
