package com.project.kitap.yurdu.test;

import com.project.kitap.yurdu.driver.BaseTest;
import com.project.kitap.yurdu.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();


    }


}
