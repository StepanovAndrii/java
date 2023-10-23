package org.dut.lab3;

import java.util.ArrayList;

public record Cart(ArrayList<Product> storage) {
    public void addProductToCart(Product product){
        storage.add(product);
    }
    public void deleteProductFromCart(int index){
        storage.remove(index);
    }
    public ArrayList<Product> getCartProducts(){
        return storage;
    }
}
