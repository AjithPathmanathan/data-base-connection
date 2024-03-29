package com.example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book_Controller {
    @Autowired
    Book_Service book_service;
    @PostMapping("/book")
            public String SaveBook(@RequestBody Book book){
        book_service.SaveBook(book);
        return "your book is saved";
    }


}
