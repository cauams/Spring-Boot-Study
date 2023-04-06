package br.caua.study.controller;

import br.caua.study.model.entity.Product;
import br.caua.study.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product newProduct(@RequestParam String name) {
        Product p = new Product(name);
        productRepository.save(p);
        return p;
    }

}
