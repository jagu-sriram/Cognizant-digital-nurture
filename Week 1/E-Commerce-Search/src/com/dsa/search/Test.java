package com.dsa.search;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Smartphone", "Electronics"),
            new Product(1, "Shoes", "Footwear"),
            new Product(5, "Laptop", "Electronics"),
            new Product(2, "Watch", "Accessories"),
            new Product(4, "Backpack", "Bags")
        };

        // Linear Search - TC: O(n)
        System.out.println("Linear Search:");
        Product result1 = LinearSearch.search(products, 4);
        System.out.println(result1);

        // Binary Search - TC: O(logn)
        System.out.println("\nBinary Search:");
        BinarySearch.sortProducts(products);
        Product result2 = BinarySearch.search(products, 4);
        System.out.println(result2);
    }
}

