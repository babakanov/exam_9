package com.attractor.cw9.controller;

import com.attractor.cw9.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @Autowired
    static List<Rate> rateList = new ArrayList<>();

    public static List<Rate> getRateList(String strURL) throws IOException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;

        try {

            dBuilder = dbFactory.newDocumentBuilder();

        } catch (ParserConfigurationException e) {

            e.printStackTrace();
        }



        Document doc = null;
        try {

            doc = dBuilder.parse(strURL);

        } catch (SAXException e) {

            e.printStackTrace();

        }

        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("Currency");
        for (int i = 0; i < nodeList.getLength(); i++) {


            Node node = nodeList.item(i);
            Element element = (Element) node;
            String code = String.valueOf(element.getAttribute("ISOCode"));
            Double value = Double.valueOf(element.getElementsByTagName("Value").item(0).getTextContent().replaceAll(",", "."));

            String date =String.valueOf(doc.getFirstChild().getAttributes().getNamedItem("Date").getNodeValue());

            Rate rate = new Rate(date, code, value);
            rateList.add(rate);


        }


        return rateList;

    }
}
