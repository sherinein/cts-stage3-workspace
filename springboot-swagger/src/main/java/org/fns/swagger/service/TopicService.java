package org.fns.swagger.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.fns.swagger.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	
	private List<Topic> topics=new LinkedList<Topic>(Arrays.asList(new Topic("Spring","SpringFramework","Springdescription"),
			 new Topic("J2EE","J2EE Framwork","J2EE description"),
			 new Topic("Hibernate","HibernateFramework","Hibernatedescription")
			 ));

	
	// to get all the topics
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	// get particular topic
	public Topic getTopic(String id) {
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
	
	// add new topic
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	
	public void updateTopic(String id,Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) { 
				topics.set(i, topic);
				return;
			
			}
		}
	}
	
	
	
	
	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
	
	
	

}
