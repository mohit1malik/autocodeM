package controllers;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    private final String SITE_IS_UP = "SITE IS UP";
    private final String SITE_IS_DOWN = "SITE IS DOWN";
    private final String INCORRECT_URL= "URL IS INCORRECT";

    @GetMapping("/checek")
    public String getUrlStatusMessage(@RequestParam String url) {

        String returnMessagem = " ";

        try {
            URL urlObj = new URL(url);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        


        return returnMessagem;
    }
    
}
