package org.sid.billingservice.feign;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(name = "PRODUCT-SERVICE") //name s'écrit en Maj puisque les nom des micro-services sont déclarés en Maj dans l'annuaire
public interface ProductItemRestClient {
    @GetMapping(path = "/products")
    PagedModel<Product> PageProducts(); // pour retourner une page des produits
    @GetMapping(path="/products/{id}")
    Product getProductById(Long id);
}
