package com.hcs.securepassword;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;

@SpringBootApplication
public class SecurePasswordApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder= new SpringApplicationBuilder(SecurePasswordApplication.class);
		builder.headless(false).run(args);

		JFrame frame = new JFrame("Secure Password");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setContentPane(builder.context().getBean(SecurePasswordValue.class).panel);
		frame.setVisible(true);
	}

}
