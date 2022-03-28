package com.project.kitap.yurdu.page;

import com.project.kitap.yurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritiesPage {
    Methods methods;

    Logger logger= LogManager.getLogger(LoginPage.class);
    public FavoritiesPage(){
        methods=new Methods();
    }

    public void favoritiesCheck(){
        methods.hover(By.xpath("//*[@class='common-sprite' and contains(text(),'Listelerim')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//li/a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(2);
        Assert.assertEquals("4",methods.getText(By.xpath("//*[@class='favorite-tag active']/span")));
        logger.info("Favorilerdeki toplam ürün sayısı="+methods.getText(By.xpath("//*[@class='favorite-tag active']/span")));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".logo-text"));
        methods.waitBySeconds(2);
    }
}
