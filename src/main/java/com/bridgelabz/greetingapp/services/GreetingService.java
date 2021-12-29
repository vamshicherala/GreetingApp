package com.bridgelabz.greetingapp.services;

import java.util.concurrent.atomic.AtomicLong;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import Data.UserData;

@Service
public class GreetingService implements IGreetingService{
    private static final String template = "Hello world";
	private final AtomicLong counter = new AtomicLong();

	@Override
	public Greeting greetingMessage() {
		return new Greeting(counter.incrementAndGet(), String.format(template));
	}

	@Override
	public String greetingMessageByName(UserData userData) {
		User user = new User();
		ModelMap modelMapper = new ModelMapper();
		modelMapper.map(userData, user);
		return ("Hello " + user.getFirstName() + " " + user.getLastName());
	}
}
