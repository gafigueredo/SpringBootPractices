package com.mypractices.productsrest.service;

import com.mypractices.productsrest.entity.Product;
import com.mypractices.productsrest.repository.IProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> listProducts() {
        return this.productRepository.findAll();
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    public Product listProductById(Integer id) {
        return this.productRepository.getById(id);
    }

    @Override
    @Transactional
    public void deleteProductById(Integer id) {
        this.productRepository.deleteById(id);
    }
}
