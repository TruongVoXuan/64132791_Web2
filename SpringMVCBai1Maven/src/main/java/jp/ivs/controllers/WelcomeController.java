package jp.ivs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeController {
@RequestMapping("/welcome")
public String welcome() {
	return "viewWelcome";
}
}
