package com.project.kitap.yurdu.page;

import com.project.kitap.yurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
public class LoginPage {
    Methods methods;

    Logger logger= LogManager.getLogger(LoginPage.class);
    public LoginPage(){
        methods=new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login"));
        methods.waitBySeconds(5);
      methods.click(By.cssSelector(".popupCloseIcon"));
       methods.waitBySeconds(5);

        methods.sendKeys(By.id("login-email"),"tgcakkayaa@gmail.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-password"),"461568T.a");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);



    }




}

