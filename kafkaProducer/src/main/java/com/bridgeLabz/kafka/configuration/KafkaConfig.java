package com.bridgeLabz.kafka.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.bridgeLabz.kafka.model.UserModel;

@Configuration
public class KafkaConfig
{
     @Bean 
     public ProducerFactory<String, UserModel> producerFactory()
     {
    	 Map<String, Object> config =new HashMap<>();
    	 
    	 config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
    	 config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    	 config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
    	 return new DefaultKafkaProducerFactory<>(config);
     }
     
     @Bean
     public KafkaTemplate<String, UserModel> kafkaTemplate()
     {
    	 return new KafkaTemplate<>(producerFactory());
     }
}
