/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.oauthclient;

/**
 * @author Rob Winch
 * @since 5.0
 */
//@EnableWebFluxSecurity
//@EnableReactiveMethodSecurity
public class HelloWebfluxSecurityConfig {

//	@Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//         http
//              .authorizeExchange()
//                   .anyExchange().authenticated()
//                        .and()
//                   .oauth2Login();
//         return http.build();
//    }
//	
//	@Bean
//	ReactiveClientRegistrationRepository clientRegistrations() {
//	    ClientRegistration clientRegistration = ClientRegistrations
//	            .fromIssuerLocation("http://localhost:8180/auth/realms/demo/")
//	            .clientId("spring-security")
//	            .clientSecret("53007b03-2756-492e-b2ac-a9c53933f62e")
//	            .build();
//	    return new InMemoryReactiveClientRegistrationRepository(clientRegistration);
//	}

//	@Bean
//	public MapReactiveUserDetailsService userDetailsService() {
//		User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//		UserDetails rob = userBuilder.username("rob").password("rob").roles("USER").build();
//		UserDetails admin = userBuilder.username("admin").password("admin").roles("USER", "ADMIN").build();
//		return new MapReactiveUserDetailsService(rob, admin);
//	}
}
