package com.project.kitap.yurdu.test;

import com.project.kitap.yurdu.driver.BaseTest;
import com.project.kitap.yurdu.page.FavoritiesPage;
import com.project.kitap.yurdu.page.LoginPage;
import com.project.kitap.yurdu.page.ProductPage;
import org.junit.Test;

public class FavoritiesTest extends BaseTest {

    @Test
    public void  favoritiesTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        ProductPage productPage=new ProductPage();
        productPage.searchAndScroll();
        FavoritiesPage favoritiesPage=new FavoritiesPage();
        favoritiesPage.favoritiesCheck();

    }
}
