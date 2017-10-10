package com.sitewhere.microservice.spi.kafka;

import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.server.lifecycle.ILifecycleComponent;

/**
 * Component that produces messages that are sent to a Kafka topic.
 * 
 * @author Derek
 */
public interface IMicroserviceProducer extends ILifecycleComponent {

    /**
     * Get name of Kafka topic which will receive the messages.
     * 
     * @return
     * @throws SiteWhereException
     */
    public String getTargetTopicName() throws SiteWhereException;

    /**
     * Send a message to the topic.
     * 
     * @param key
     * @param message
     * @throws SiteWhereException
     */
    public void send(String key, byte[] message) throws SiteWhereException;
}