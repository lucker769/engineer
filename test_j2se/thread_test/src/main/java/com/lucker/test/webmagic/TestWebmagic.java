package com.lucker.test.webmagic;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;

/**
 * Created by lucker on 2018/8/8.
 */
public class TestWebmagic {

    public static void main(String[] args) {
        OOSpider.create(Site.me().setSleepTime(1000),
                new ConsolePageModelPipeline(), Farm.class)
                .addUrl("http://www.acproperty.com.au/farm/Info/HouseInfo.aspx?id=20180807115848M&%E6%BE%B3%E6%B4%B2%E7%89%A9%E4%B8%9A%E5%87%BA%E5%94%AE%E7%B1%BB%E5%9E%8B=%E5%87%BA%E5%94%AE%E6%BE%B3%E6%B4%B2%E5%86%9C%E5%9C%BAGilston%E5%8C%BA%E5%9C%9F%E5%9C%B0%20|%20land&add=%E5%85%B7%E4%BD%93%E5%9C%B0%E5%9D%80871_Gilston%20Road_Gilston_QUEENSLAND&menuid=1&housetype=%E6%BE%B3%E6%B4%B2%E5%86%9C%E5%9C%BA%E7%89%A9%E4%B8%9A%E5%87%BA%E5%94%AEAustralian-Farm-Agriculture-land-Australia-Realestate")
                .thread(5)
                .run();
    }

}
