package com.project.kitap.yurdu.page;

import com.project.kitap.yurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    }
}
