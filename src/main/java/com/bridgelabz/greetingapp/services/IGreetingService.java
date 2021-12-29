package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;


public interface IGreetingService {
   
	Greeting greetingMessage();


	Greeting addGreeting(User user);

	
}
