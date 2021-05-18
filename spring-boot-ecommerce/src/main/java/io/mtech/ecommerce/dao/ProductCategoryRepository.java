package io.mtech.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.mtech.ecommerce.entity.ProductCategory;
@RepositoryRestResource(collectionResourceRel ="productCateory", path = "product-category" )
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
