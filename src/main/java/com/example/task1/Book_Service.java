package com.example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

@Service
public class Book_Service {
    @Autowired
    Book_Repository book_repository;

    public void SaveBook(Book book) {
        book_repository.save(book);
    }
    public void getxml() throws ParserConfigurationException, IOException, SAXException {
        File file = new File("Book.xml");
        DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = Factory.newDocumentBuilder();
        Document doc = builder.parse(file);

        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i=0; i< nodeList.getLength();i++){
            Element element = (Element) nodeList.item(i);
            Book book = new Book();
            book.setTitle(element.getElementsByTagName("title").item(0).getTextContent());
            book.setAuthor(element.getElementsByTagName("author").item(0).getTextContent());
            book.setPublished_year(Integer.parseInt(element.getElementsByTagName("published_year").item(0).getTextContent()));
            book.setPrice(Double.parseDouble(element.getElementsByTagName("author").item(0).getTextContent()));

            book_repository.save(book);


    }
}
}
