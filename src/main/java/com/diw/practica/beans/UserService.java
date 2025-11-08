package com.diw.practica.beans;

import com.diw.practica.model.Libro;

import java.util.Date;
import java.util.Vector;

public interface UserService {
    Vector<Libro> personalView();
    Date getDataNextCheck();
    void addOrder(String title, String author, String editorial, String ISBN, String estimatedPrice);
    float getMaxAmount();
    String getNameUserLogged();
    Date getActualDate();
    void editOrder(String title, String author, String editorial, String ISBN, String estimatedPrice);
    void deleteOrder(String ISBN);
    void getOrder(String ISBN);
}
