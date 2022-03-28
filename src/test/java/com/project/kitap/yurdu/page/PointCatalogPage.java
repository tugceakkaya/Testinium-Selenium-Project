package com.project.kitap.yurdu.page;

import com.project.kitap.yurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointCatalogPage {
    Methods methods;
    Logger logger= LogManager.getLogger(LoginPage.class);
    public PointCatalogPage(){
        methods=new Methods();
    }

    public void point(){

        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectText(By.xpath("//*[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.hover(By.xpath("//*[@class='mn-strong common-sprite' and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@class='mn-icon icon-angleRight' and contains(text(),'Hobi')]"));
        methods.waitBySeconds(5);


    }

}
