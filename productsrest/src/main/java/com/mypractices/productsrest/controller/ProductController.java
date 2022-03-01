package com.mypractices.productsrest.controller;

import com.mypractices.productsrest.entity.Product;
import com.mypractices.productsrest.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public List<Product> listProducts(){
        return this.productService.listProducts();
    }

    @DeleteMapping("/product/delete/{id}")
    public void deleteProductById(@PathVariable Integer id){
        this.productService.deleteProductById(id);
    }

    @PostMapping("/product/new")
    public void deleteProductById(@RequestBody Product product){
        this.productService.saveProduct(product);
    }

    @GetMapping("/product/{id}")
    public Product listProductById(@PathVariable Integer id){
        return this.productService.listProductById(id);
    }
}
