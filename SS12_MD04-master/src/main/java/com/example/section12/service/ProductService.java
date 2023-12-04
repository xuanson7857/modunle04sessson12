package com.example.section12.service;

import com.example.section12.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> list;
  public   ProductService() {
        list = new ArrayList<>();
        // Khởi tạo và thêm 3 đối tượng Product vào danh sách products
        Product product1 = new Product(1, "Product 1", 29.99);
        Product product2 = new Product(2, "Product 2", 39.99);
        Product product3 = new Product(3, "Product 3", 49.99);
        list.add(product1);
        list.add(product2);
        list.add(product3);
    }
    public List<Product>findAll(){
        return list;
    }

    public void save(Product product){
      list.add(product);
    }

    public Product edit(int id){
        for (Product p:list
             ) {
           if (p.getId()==id){
               return  p;
           }
        }
return null;
    }

    public List<Product> update(Product updatedProduct, int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                // Cập nhật thông tin sản phẩm
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                break; // Kết thúc vòng lặp khi sản phẩm được cập nhật
            }
        }
        return list;
    }

    public List<Product> delete(int id){
        for (Product product:list
             ) {
          if (product.getId()==id){
              list.remove(product);
              return list;
          }
        }
        return null;
    }

}
