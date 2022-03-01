package com.mypractices.productsrest.service;


import com.mypractices.productsrest.entity.Product;

import java.util.List;

public interface IProductService {

    public List<Product> listProducts();
    public void saveProduct(Product product);
    public Product listProductById(Integer id);
    public void deleteProductById(Integer id);
}
