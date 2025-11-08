package com.diw.practica.beans;

import com.diw.practica.model.Libro;

import java.util.Map;
import java.util.Vector;

public interface AdminService {
    void checkOut(int day, int month, int year, float nextMaxAmount);
    Map<String, Vector<Libro>> getAllOrders();
    String getNameUserLogged();
}
