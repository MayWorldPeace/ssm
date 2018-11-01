package dd.interview;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-17 23:49
 **/
public class JsoupTest {

    public static void main(String[] args) throws IOException {
        //for(int j=1;j<=100;j++){
            Document document = Jsoup.connect("https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&suggest=1.def.0.V05&wq=shouji&cid2=653&cid3=655&page=1&s=342&click=0").get();
            Elements div = document.select("#J_goodsList");
            Elements lis = div.select("ul").select("li");
            int i=0;
            for (Element li:lis){
                i++;
                Element element = null;
                try {
                    element = li.select("div").get(0);
                    Element div2 = element.select(".p-img").get(0);
                    Element a = div2.select("a").get(0);
                    Element img = a.select("img").get(0);
                    System.out.println("http:"+img.attr("source-data-lazy-img"));
                    URL url = new URL("http:"+img.attr("source-data-lazy-img"));
                    URLConnection connection = url.openConnection();
                    InputStream is = connection.getInputStream();
                    FileOutputStream os  = new FileOutputStream(new File("C:\\Users\\钟超远\\Desktop\\img",i+".jpg"));
                    int len=0;
                    byte[] bys=new byte[1024];
                    while ((len=is.read(bys))!=-1){
                        os.write(bys,0,len);
                    }
                } catch (Exception e) {
                    continue;
                }
           // }
        }
    }
}
