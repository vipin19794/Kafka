package com.bridgeLabz.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.bridgeLabz.kafka.model.UserModel;

@Service
public class KafkaConsumer
{
	 @KafkaListener(topics = "vipin_sharma" , groupId = "group_id")
     public void consume(String message)
     {
		 System.out.println("consumed message : "+message);
     }
	 
	 @KafkaListener(topics = "kafka_example_json", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
	 public void consumeJson(UserModel userModel)
	 {
		 System.out.println("name: "+userModel.getName());
		 System.out.println("dept: "+userModel.getDept());
		 System.out.println("salary: "+userModel.getSalary());
		 System.out.println("mobile: "+userModel.getMobile());
		 System.out.println("email: "+userModel.getEmail());
	 }

}
