package io.javabrains.springbootstarter.topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  Arrays.asList(
            new Topic("Spring", "Spring framework", "Spring framework description"),
            new Topic("java", "Core java", "Java script description"),
            new Topic("javascript", "JavaScript", "JavaScript description" )
    );

public List<Topic> getAllTopics(){

    return topics;
}


}
