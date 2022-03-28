package com.project.kitap.yurdu.test;

import com.project.kitap.yurdu.driver.BaseTest;
import com.project.kitap.yurdu.page.FavoritiesPage;
import com.project.kitap.yurdu.page.LoginPage;
import com.project.kitap.yurdu.page.PointCatalogPage;
import org.junit.Test;

public class PointCatalogTest extends BaseTest {

    @Test
    public void pointCatalogTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        FavoritiesPage favoritiesPage=new FavoritiesPage();
        favoritiesPage.favoritiesCheck();
        PointCatalogPage pointCatalogPage=new PointCatalogPage();
        pointCatalogPage.point();
    }



}
