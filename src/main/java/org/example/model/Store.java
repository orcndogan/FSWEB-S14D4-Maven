package org.example.model;

public class Store {
    public static void main(String[] args) {
        // Ürün objeleri oluşturuluyor
        ProductForSale chocolate = new Chocolate("Chocolate", 10, "Delicious milk chocolate.");
        ProductForSale coke = new Coke("Coke", 15, "Drink Coke.");
        ProductForSale bread = new Bread("Bread", 8, "Delicious and healthy bread");

        // Ürünler dizisi oluşturuluyor
        ProductForSale[] products = {chocolate, coke, bread};

        // Ürünleri listeleme
        listProducts(products);
    }


    public static void listProducts(ProductForSale[] products) {
        for(int i=0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}