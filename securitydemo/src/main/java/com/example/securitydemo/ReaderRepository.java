package com.example.securitydemo;

import com.example.securitydemo.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository  extends JpaRepository<Reader, String> {
    Reader findByUsername(String username);

}
