package com.test.bootrestbook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file"))
    {
        return ResponseEntity.ok("working");
    }

}
