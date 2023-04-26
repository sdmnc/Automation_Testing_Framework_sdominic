import Managers.WebDriverManager;

public class TestRunner {

    public static void main (String [] args) throws InterruptedException {

        WebDriverManager webDriverManager = new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://demo.opencart.com/admin/");
        Thread.sleep(10000);
        webDriverManager.closeDriver();


    } // end main
}
