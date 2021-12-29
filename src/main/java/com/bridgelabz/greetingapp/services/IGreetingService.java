package com.bridgelabz.greetingapp.services;

import com.bridgelabz.greetingapp.model.Greeting;

import Data.UserData;

public interface IGreetingService {
    Greeting greetingMessage();
    String greetingMessageByName(UserData userData);
}
