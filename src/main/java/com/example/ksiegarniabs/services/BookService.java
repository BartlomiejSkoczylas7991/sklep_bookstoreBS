package com.example.ksiegarniabs.services;

import com.example.ksiegarniabs.entity.Ksiazka;

import java.util.List;

public interface BookService {
    List<Ksiazka> getBooks();
    public void saveBook(Ksiazka ksiazka);
}