package cn.edu.hfut.dmic.htmlbot;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by a on 2014/11/2.
 */
public class HtmlBot {

    public static DomPage getDomPageByURL(String url) throws IOException {
        Document doc=Jsoup.connect(url).get();
        return new DomPage(doc);
    }

    public static DomPage getDomPageByHtml(String html){
        return getDomPageByHtml(html,null);
    }

    public static DomPage getDomPageByHtml(String html,String url){

        Document doc= Jsoup.parse(html);
        if(url!=null){
            doc.setBaseUri(url);
        }
        DomPage domPage=new DomPage(doc);
        return domPage;
    }
}
