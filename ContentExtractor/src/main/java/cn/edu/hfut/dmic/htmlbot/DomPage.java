package cn.edu.hfut.dmic.htmlbot;

import org.jsoup.nodes.Document;

/**
 * Created by a on 2014/11/2.
 */
public class DomPage {

    public DomPage(Document doc) {
        this.doc = doc;
    }

    private Document doc=null;


    public String getURL(){
        return doc.baseUri();
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }
}
