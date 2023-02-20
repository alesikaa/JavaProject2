package JavaProject2;

import Class23.Phone;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
 interface RemoteWebDriver extends WebDriver{
    void navigate();
 }
interface  TakesScreenshot extends WebDriver{
    void getScreenshot();
}
 class ChromeDriver implements WebDriver{
    @Override
     public void open(){
        System.out.println("Open Chrome");
    }
    @Override
     public void close(){
        System.out.println("Close Chrome");
    }
    @Override
     public String  getTitle (){
        return null;

    }
 }
  class FireFox implements WebDriver{
    @Override
      public void open(){
        System.out.println("Open FireFox");
    }
    @Override
      public void close(){
        System.out.println("Close Firefox");
    }
    @Override
      public String getTitle(){
        return null;
    }
  }
  class Safari implements WebDriver{
    @Override
      public void open(){
        System.out.println("Open Safari");
    }
    @Override
      public void close(){
        System.out.println("Close Safari");
    }
    @Override
      public String getTitle(){
        return null;
    }
  }