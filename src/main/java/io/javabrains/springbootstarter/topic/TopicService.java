package io.javabrains.springbootstarter.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic("Spring", "Spring framework", "Spring framework description"),
            new Topic("java", "Core java", "Java script description"),
            new Topic("javascript", "JavaScript", "JavaScript description" ))
    );

public List<Topic> getAllTopics(){

    return topics;
}


    public Topic getTopic(String id) {
    return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();


    }

    public void addTopic(Topic topic) {
    topics.add(topic);

    }
}
