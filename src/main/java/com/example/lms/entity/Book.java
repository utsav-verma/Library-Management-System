package com.example.lms.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name= "books")
public class Book {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name = "books_authors",
            joinColumns = {@JoinColumn(name= "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private List<Authors> authors;

    @ManyToMany
    @JoinTable(name = "books_categories",
            joinColumns = {@JoinColumn(name= "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<Category> categories;

    @ManyToMany
    @JoinTable(name = "books_publishers",
            joinColumns = {@JoinColumn(name= "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "publisher_id")}
    )
    private List<Publisher> publishers;

    private int price;

    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
