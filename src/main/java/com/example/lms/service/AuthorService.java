package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.lms.repo.AuthorRepo;
import com.example.lms.entity.Authors;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public List<Authors> getAllAuthors(){
        return authorRepo.findAll();
    }

    public Authors getAuthorById(int id){
        return authorRepo.findById(id).orElse(null);

    }

    public Authors saveOrUpdateAuthor( Authors author){

        return authorRepo.save(author);
    }

    public void deleteAuthorById(int id){

        authorRepo.findById(id).orElse(null);

        authorRepo.deleteById(id);
    }
}

