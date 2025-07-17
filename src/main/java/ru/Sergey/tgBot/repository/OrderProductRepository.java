package ru.Sergey.tgBot.repository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.Sergey.tgBot.entity.OrderProduct;
import ru.Sergey.tgBot.entity.Product;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "order-products", path = "order-products")
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    List<Product> findTopPopularProducts(PageRequest of);

    List<Product> findProductsByClientId(Long clientId);
}

