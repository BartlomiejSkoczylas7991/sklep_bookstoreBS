package com.example.ksiegarniabs.dao;

import com.example.ksiegarniabs.entity.Ksiazka;

import java.util.List;

public interface BookDAO {
    public List<Ksiazka> getBooks();
    public void saveBook(Ksiazka ksiazka);
}
