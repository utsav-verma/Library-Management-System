package com.example.lms.controller;


import com.example.lms.entity.Authors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.lms.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Authors>> getAllAuthors(){
        List<Authors> authors = authorService.getAllAuthors();

        return ResponseEntity.ok(authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Authors> getAuthor(@PathVariable int id){
        Authors author = authorService.getAuthorById(id);

        if(author == null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(author);
    }

    @PostMapping

    public ResponseEntity<Authors> saveAuthor(@RequestBody Authors author){
        Authors createdAuthor = authorService.saveOrUpdateAuthor(author);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdAuthor);
    }

    @PutMapping("/{id}")

    public ResponseEntity<Authors> updateAuthor(@PathVariable int id, @RequestBody Authors author)
    {
        Authors existingAuthor = authorService.getAuthorById(id);

        if(existingAuthor == null)
        {
            return ResponseEntity.notFound().build();
        }

        author.setId(id);
        authorService.saveOrUpdateAuthor(author);
        return ResponseEntity.ok(author);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable int id){
        Authors author = authorService.getAuthorById(id);

        if(author == null)
        {
            return ResponseEntity.notFound().build();
        }
        authorService.deleteAuthorById(id);

        return ResponseEntity.noContent().build();
    }


}
