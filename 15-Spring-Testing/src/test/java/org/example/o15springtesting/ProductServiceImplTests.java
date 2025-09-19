package org.example.o15springtesting;

import org.example.o15springtesting.entity.Product;
import org.example.o15springtesting.repo.ProductRepository;
import org.example.o15springtesting.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTests {
    @InjectMocks
    private ProductServiceImpl productService;
    @Mock
    private ProductRepository productRepository;

    private Product product;

    @BeforeEach
    public void setUp() {
        product = Product.builder()
                .id(1L)
                .name("Test Product")
                .price(10.11)
                .quantity(12).build();
    }
    @Test
    void shouldSaveProduct() {
        //arrange data
        when(productRepository.save(any(Product.class))).thenReturn(product);
        //action
        Product savedProduct = productService.createProduct(product);
        //assert
        Assertions.assertNotNull(savedProduct);
        Assertions.assertEquals(product, savedProduct);
        verify(productRepository,times(1)).save(any(Product.class));
    }
    @Test
    void shouldUpdateProduct(){
        //arrange
        Product updateProduct=Product.builder()
                .id(1L)
                .name("Update Product")
                .price(10.11)
                .quantity(11)
                .build();
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        when(productRepository.save(any(Product.class))).thenReturn(product);
        //action
        Product result=productService.updateProduct(updateProduct);
        //assert
        Assertions.assertNotNull(result);
        Assertions.assertEquals(updateProduct,result);
        Assertions.assertEquals("Update Product",result.getName());
        Assertions.assertEquals(10.11,result.getPrice());
        Assertions.assertEquals(11,result.getQuantity());
        verify(productRepository, times(1)).findById(1L);
    }
    @Test
    void shouldReturnAllProducts() {
        // Arrange
        Product product2 = Product.builder()
                .id(2L)
                .name("Another Product")
                .price(20.00)
                .quantity(5)
                .build();

        List<Product> productList = List.of(product, product2);
        when(productRepository.findAll()).thenReturn(productList);

        // Act
        List<Product> result = productService.getAllProducts();

        // Assert
        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(productList, result);
        verify(productRepository, times(1)).findAll();
    }
    @Test
    void shouldDeleteProductById() {
        // Arrange
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        doNothing().when(productRepository).delete(product);

        // Act
        productService.deleteProductById(1L);

        // Assert
        verify(productRepository, times(1)).findById(1L);
        verify(productRepository, times(1)).delete(product);
    }



}
