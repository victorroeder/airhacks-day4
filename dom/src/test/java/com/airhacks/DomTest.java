package com.airhacks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author airhacks.com
 */
public class DomTest {

    private DocumentBuilderFactory builderFactory;
    private DocumentBuilder documentBuilder;
    private Document document;

    @Before
    public void init() throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
        this.builderFactory = DocumentBuilderFactory.newInstance();
        this.documentBuilder = this.builderFactory.newDocumentBuilder();

        this.document = this.documentBuilder.parse(new FileInputStream("index.html"));
    }

    @Test
    public void parse() {
        NodeList nodes = this.document.getElementsByTagName("body").item(0).getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node element = nodes.item(i);
            System.out.println("element = " + element);
            Node textElement = element.getFirstChild();
            System.out.println("textElement = " + textElement);
        }

    }

}
