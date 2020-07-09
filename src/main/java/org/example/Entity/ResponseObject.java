package org.example.Entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ResponseObject {

    @Getter
    @Setter
    private int msisdn;

    @Getter
    @Setter
    private String action;

    @Getter
    @Setter
    private long timestamp;

    public ResponseObject(int msisdn, String action, long timestamp) {
        this.msisdn = msisdn;
        this.action = action;
        this.timestamp = timestamp;
    }

}
