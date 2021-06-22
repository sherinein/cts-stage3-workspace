package org.fns.swagger.controller;

import java.util.List;

import org.fns.swagger.model.Topic;
import org.fns.swagger.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="onlinetopic", description="topics details from in Online Store")
public class TopicController {
	@Autowired
	private TopicService topicService;

	@GetMapping("/topics")
	@ApiOperation(value="Retrieve all the topics",notes="All the topics displayed from the store",response=Topic.class)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	// Get Particular topic
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	// Add Topic Object
	@PostMapping( "/topics")
	public void addTopic(Topic topic) {
		topicService.addTopic(topic);
	}

	// update Topic Object
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}

	// update Topic Object
	@DeleteMapping(value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}


}
