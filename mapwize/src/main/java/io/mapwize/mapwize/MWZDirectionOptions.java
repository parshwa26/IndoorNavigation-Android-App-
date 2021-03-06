package io.mapwize.mapwize;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MWZDirectionOptions {

    private boolean isAccessible;
    private boolean waypointOptimize;

    @JsonGetter("isAccessible")
    public boolean isAccessible() {
        return isAccessible;
    }

    @JsonSetter("isAccessible")
    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    @JsonGetter("waypointOptimize")
    public boolean isWaypointOptimize() {
        return waypointOptimize;
    }

    @JsonSetter("waypointOptimize")
    public void setWaypointOptimize(boolean waypointOptimize) {
        this.waypointOptimize = waypointOptimize;
    }

    public String toJSONString() {
        String jsonInString = null;
        try {
            jsonInString = new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonInString;
    }

}
