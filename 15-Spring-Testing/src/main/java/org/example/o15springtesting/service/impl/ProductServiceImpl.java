package org.example.o15springtesting.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.o15springtesting.entity.Product;
import org.example.o15springtesting.repo.ProductRepository;
import org.example.o15springtesting.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No product found with id: " + id)
        );
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existProduct = getProductById(product.getId());
        existProduct.setName(product.getName());
        existProduct.setPrice(product.getPrice());
        existProduct.setQuantity(product.getQuantity());
        return productRepository.save(existProduct);
    }

    @Override
    public void deleteProductById(Long id) {
        Product product = getProductById(id);
        productRepository.delete(product);

    }
}
