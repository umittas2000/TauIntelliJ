package org.example.helpers;

import org.openqa.selenium.WebDriver;

public class Helpers {
    //Press alt + enter to import class

    public Helpers(){

    }
    public String getTitle(WebDriver driver){

        return driver.getTitle();
    }

    public String getCurrentState(WebDriver driver){
        return driver.getCurrentUrl();
    }
}
