package com.example.oauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthclientApplication.class, args);
	}
	
//	@Bean
//	public RouterFunction<ServerResponse> routes(HelloUserController userController) {
//		return RouterFunctions.route(
//				RequestPredicates.GET("/"), userController::hello);
//	}

}
