package com.example.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lms.entity.Authors;

public interface AuthorRepo extends JpaRepository<Authors, Integer> {

}
