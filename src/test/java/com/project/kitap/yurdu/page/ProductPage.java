package com.project.kitap.yurdu.page;

import com.project.kitap.yurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger= LogManager.getLogger(LoginPage.class);
    public ProductPage(){
        methods=new Methods();
    }

    public void searchAndScroll(){
        methods.sendKeys(By.id("search-input"),"Oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][7]"));
        methods.waitBySeconds(5);
        methods.selectRandomFavourite(By.xpath("//a[@class='add-to-favorites']"));
        methods.waitBySeconds(5);

    }

}
