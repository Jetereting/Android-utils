package us.eiyou.myapplication.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Au on 2015/10/18.
 */
public class HtmlParse {

    public static Map<String,String> getTongMa() throws Exception{
        Map<String,String> tongMa=new HashMap<>();
        Document document=Jsoup.connect("http://shxxsh.com/home/index?districtId=1#none").get();
        Elements table=document.getElementsByTag("table");
        Elements td=document.getElementsByTag("td");
        for (Element text:td){
            String textString=text.text();
            tongMa.put(textString,textString);
        }
        return tongMa;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(getTongMa().toString());
    }
}
