package com.example.securitydemo.controller;

import com.example.securitydemo.ReadingListReposity;
import com.example.securitydemo.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/books")
public class ReadingListController {

    private static final Logger logger = LoggerFactory.getLogger(ReadingListController.class);
    private ReadingListReposity readingListReposity;

    @Autowired
    public ReadingListController(ReadingListReposity readingListReposity) {
        this.readingListReposity = readingListReposity;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        logger.info(reader);
        List<Book> readingList = readingListReposity.findByReader(reader);

        logger.info(readingList.toString());
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }

        return "readingList";
    }
}
