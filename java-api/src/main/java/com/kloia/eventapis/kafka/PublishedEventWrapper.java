package com.kloia.eventapis.kafka;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zeldalozdemir on 25/04/2017.
 */
@Data
public class PublishedEventWrapper implements Serializable {

    private static final long serialVersionUID = 7950670808405003425L;

    @JsonIgnore
    private String event;

    @JsonSetter
    public void setEvent(ObjectNode event) {
        this.event = event.toString();
    }

    @JsonGetter
    @JsonRawValue
    public String getEvent() {
        return event;
    }

    @JsonSetter
    public void setEventData(String eventData) {
        this.event = eventData;
    }

    private String opId;
    
    private String sender;

    private Map<String,String> userContext;

    public PublishedEventWrapper() {
    }

    public PublishedEventWrapper(String opId, String eventData) {
        this.opId = opId;
        this.event = eventData;
    }


}
