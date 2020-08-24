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

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Rob Winch
 * @since 5.0
 */
//@RestController
//@Component
@Controller
public class HelloUserController {

//	@GetMapping("/")
//	public Mono<Map<String, String>> hello(Mono<Principal> principal) {
//		return principal
//			.map(Principal::getName)
//			.map(this::helloMessage);
//	}
//
//	private Map<String, String> helloMessage(String username) {
//		return Collections.singletonMap("message", "Hello " + username + "!");
//	}
	
//	public Mono<ServerResponse> hello(ServerRequest serverRequest) {
//		return serverRequest.principal()
//			.map(Principal::getName)
//			.flatMap(username ->
//				ServerResponse.ok()
//					.contentType(MediaType.APPLICATION_JSON)
//					.syncBody(Collections.singletonMap("message", "Hello " + username + "!"))
//			);
//	}
	
//	private final HelloWorldMessageService messages;
//
//	public HelloUserController(HelloWorldMessageService messages) {
//		this.messages = messages;
//	}
//
//	@GetMapping("/message")
//	public Mono<String> message() {
//		return this.messages.findMessage();
//	}
	
	@GetMapping("/")
	public String index(Model model,
						@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
						@AuthenticationPrincipal OAuth2User oauth2User) {
		model.addAttribute("userName", oauth2User.getName());
		model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
		model.addAttribute("userAttributes", oauth2User.getAttributes());
		return "index";
	}
}
