package com.klu.skill6.Controller;

import com.klu.skill6.Model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    // Task 2: /welcome
    @GetMapping("/welcome")
    public String welcome() {
        return "📚 Welcome to the Online Library System!";
    }

    // Task 3: /count
    @GetMapping("/count")
    public int countBooks() {
        return 100; // sample total books
    }

    // Task 4: /price
    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    // Task 5: /books
    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList("Java Basics", "Spring Boot", "Hibernate", "React JS");
    }

    // Task 6: /books/{id}
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "📖 Book details for ID: " + id;
    }

    // Task 7: /search?title=...
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "🔍 You searched for book: " + title;
    }

    // Task 8: /author/{name}
    @GetMapping("/author/{name}")
    public String authorName(@PathVariable String name) {
        return "✍️ Author Name: " + name;
    }

    // Task 9: /addbook (POST)
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "✅ Book added successfully: " + book.getTitle();
    }

    // Task 10: /viewbooks
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}
