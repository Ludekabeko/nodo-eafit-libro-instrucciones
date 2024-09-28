package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @GetMapping("/book")
    public String getBookDetails(
            @RequestParam String title,
            @RequestParam String author,
            @RequestParam int year,
            Model model) {
        
        // Crear el objeto Book con los parámetros recibidos
        Book book = new Book(title, author, year);
        
        // Pasar el objeto Book a la vista
        model.addAttribute("book", book);
        
        // Devolver el nombre de la plantilla que renderizará la vista
        return "bookDetails";
    }
}
