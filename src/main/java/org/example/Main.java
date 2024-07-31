package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File input = new File("path");

        Document doc = Jsoup.parse(input);

        Elements allTags = doc.select("td");

        for (Element td : allTags) {
            String text = td.text().trim();
            if (!text.isEmpty()) {
                System.out.println(text);
            }
        }
    }
}