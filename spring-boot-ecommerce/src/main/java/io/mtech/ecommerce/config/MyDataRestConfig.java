package io.mtech.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import io.mtech.ecommerce.entity.Product;
import io.mtech.ecommerce.entity.ProductCategory;
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		HttpMethod[] theUnsupportedActions = { HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE };
		// Disable HTTP methods for product: PUT,POST and DELETE
		config.getExposureConfiguration().forDomainType(Product.class)
				.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
				.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	
		config.getExposureConfiguration().forDomainType(ProductCategory.class)
		.withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

	}
}
