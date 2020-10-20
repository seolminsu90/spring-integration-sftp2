package com.integration.example.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.integration.example.config.SftpConfig.UploadGateway;

@RestController
public class UploadSampleController {
    @Autowired
    private UploadGateway gateway;

    @PostMapping("/upload")
    public void uploadTest(@RequestParam(name = "file") MultipartFile file) throws IllegalStateException, IOException {
        gateway.upload(multipartToFile(file));
    }

    public File multipartToFile(MultipartFile mFile) throws IllegalStateException, IOException {
        File file = new File("D:/tempDir/" + mFile.getOriginalFilename());
        mFile.transferTo(file);
        return file;
    }
}
