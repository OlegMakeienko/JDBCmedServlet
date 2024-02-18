package com.makeienko.jdbcmedservlet.model;

import java.time.LocalDate;

public class Payment {
    private String title;
    private LocalDate date;
    private String description;
    private String category;
    private double price;
    private User owner;

    public Payment() {
    }

    public Payment(String title, LocalDate date, String description, String category, double price, User owner) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.category = category;
        this.price = price;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", owner=" + owner +
                '}';
    }
}
