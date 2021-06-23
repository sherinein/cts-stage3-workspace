package org.fns.springsecuity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
	// Authentication - to validate user
			@Override
			protected void configure(AuthenticationManagerBuilder auth) throws Exception {
				auth.inMemoryAuthentication()
				.withUser("sherine")
				.password("sherine123")
				.roles("ADMIN")
				.and()
				.withUser("lynet")
				.password("lynet123")
				.roles("USER");
					
			}
				
			/*
			 * @Bean public PasswordEncoder passwordEncoder() { return new
			 * BCryptPasswordEncoder(); }
			 */
			
			@Bean 
			public PasswordEncoder passwordEncoder() {
				return NoOpPasswordEncoder.getInstance();
			}
			//http://localhost:8090/user --> 
			//http://localhost:8090/admin
			//http://localhost:8090/logout
			// Authorization
			// permitAll() ---Allow all API, hasRole ---Permit one role, hasAnyRole --- All multiple role
			@Override
			protected void configure(HttpSecurity http) throws Exception {
				// csrf --- cross site request forgery
				http.csrf().disable();  //        http://www.abc.com/ --- > 
				
				http.authorizeRequests()
				.antMatchers("/admin/**")          
				.hasRole("ADMIN")  
				.antMatchers("/user/**")				
				.hasAnyRole("USER","ADMIN")
				.antMatchers("/").permitAll().and().formLogin();
				
				// http://localhost:8080/rest/addproduct --->admin allowed to access (hasRole -- give priority)
				//http://localhost:8080/user/showproduct --->user  & admin allowed to access (hasAnyRole)
				//http://localhost:8080/---- >permit all user (permitAll)
				
			/*	http://localhost:8080/admin/editproduct --- Only admin (hasRole )
					http://localhost:8080/user/viewproduct --- admin & user(hasAnyRole)
						http://localhost:8080/     -- all (permitAll) */
			}
			
			 // hasRole  ADMIN  (ValidUser & ROLE)
			 // hasAnyRole  ADMIN & USER (Valid User) 
			//permitAll (Not ValidUser)
			
			
			
		
		

		

}
