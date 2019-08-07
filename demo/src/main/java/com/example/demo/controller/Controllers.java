package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Data;

@RestController
public class Controllers {
	@Autowired
	Data data;
	
	@GetMapping("/jmeter/{serviceName}/{appID}/{volume}")
	public Data jMeter(@PathVariable String serviceName,@PathVariable String appID,@PathVariable int volume) {
		data.setAppID(appID);
		data.setServiceName(serviceName);
		data.setVolume(volume);
		return data;
	}

}
