package io.mtech.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.okta.spring.boot.oauth.Okta;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {

	// protect end point /api/orders
		http.authorizeRequests()
		.antMatchers("/api/orders/**")
		.authenticated()
		.and()
		.oauth2ResourceServer()
		.jwt();
		
		//add CORS Filters
		http.cors();
		
		// force a non-empty response body for 401's to make the response more friendly
		Okta.configureResourceServer401ResponseBody(http);
	}

}
