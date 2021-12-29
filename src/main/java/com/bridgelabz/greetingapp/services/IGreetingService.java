package com.bridgelabz.greetingapp.services;

import java.util.List;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;


public interface IGreetingService {
   
	Greeting greetingMessage();


	Greeting addGreeting(User user);


	Greeting findById(long id);


	List<Greeting> getAllMessages();

	Greeting updateMessage(long id);
}
