package JavaProject2;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new ChromeDriver(),new FireFox(),new Safari()};
        for(WebDriver WD:webDrivers){
            WD.open();
            WD.close();
            WD.getTitle();

        }
    }
}
