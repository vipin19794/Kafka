package com.bridgeLabz.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bridgeLabz.kafka.dto.UserDto;
import com.bridgeLabz.kafka.model.UserModel;
import com.bridgeLabz.kafka.response.Response;

@RestController
@RequestMapping("/kafka")
public class UserController
{
    @Autowired
    private KafkaTemplate<String, UserModel> kafkaTemplate;
    private static final String TOPIC = "kafka_example_json";
    
    @Autowired
    UserDto userDto;
    
    @PostMapping("/user")
	public ResponseEntity<Response> DataProduce(@RequestBody UserDto userDto) 
	{		
    	UserDto user = userDto;
		if (user != null) 
		{			
			kafkaTemplate.send(TOPIC,new UserModel(user.getD_name(),user.getD_dept(),user.getD_salary(),user.getD_mobile(),user.getD_email()));
			return ResponseEntity.status(HttpStatus.OK).body(new Response(200, "Data Send Successfull", user));
		} 
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(new Response(400, "somthing went wrong", user));
		}

	} 
    
//    @PostMapping("/user")
//    public String post(@PathVariable("name")final String name)
//    {
//    	kafkaTemplate.send(TOPIC,new UserModel(name,"technology",12000L));
//    	return "publish successfully";
//    }
}
