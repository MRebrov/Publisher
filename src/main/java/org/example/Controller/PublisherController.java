package org.example.Controller;

import lombok.extern.log4j.Log4j2;
import org.example.Service.PublisherService;
import org.example.Entity.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/api/v1")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/get")
    public ResponseObject getResponse() {
        return publisherService.getResponseObject();
    }
}
