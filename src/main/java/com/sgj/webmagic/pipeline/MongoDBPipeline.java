package com.sgj.webmagic.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Map;


@Component("MongodbPipeline")
public class MongoDBPipeline implements Pipeline {

    private static final Logger LOGGER = LoggerFactory.getLogger(MongoDBPipeline.class);


    @Override
    public void process(ResultItems resultItems, Task task) {

        Map<String, Object> mapResults = resultItems.getAll();

    }
}
