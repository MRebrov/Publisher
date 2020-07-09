package org.example.Service;

import lombok.extern.log4j.Log4j2;
import org.example.Entity.ResponseObject;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Log4j2
public class PublisherService {

    private static final String SUBSCRIPTION = "SUBSCRIPTION";
    private static final String PURCHASE = "PURCHASE";
    private final static int MIN = 1;

    public ResponseObject getResponseObject() {
        int msisdn = generateMsisdn();
        String action = generateAction();
        long epochTimestamp = getTimestamp();
        log.info("Parameters: " + msisdn + ", " + action + ", "  + epochTimestamp);
        ResponseObject responseObject = new ResponseObject(msisdn, action, epochTimestamp);
        return responseObject;
    }

    private long getTimestamp() {
        long epochTimestamp = Instant.now().getEpochSecond();
        return epochTimestamp;
    }

    private String generateAction() {
        if (Math.random() >= 0.5) {
            return SUBSCRIPTION;
        }
        return PURCHASE;
    }

    private int generateMsisdn() {
        int msisdn = ThreadLocalRandom.current().nextInt(MIN, Integer.MAX_VALUE);
        return msisdn;
    }
}
