package com.file.fileupload.Services.impl;

import com.file.fileupload.Services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {

        //file name
        String name=file.getOriginalFilename();
        //abc.png

        //random name generate fiel
        String randomId= UUID.randomUUID().toString();
        assert name != null;
        String fileName1= randomId.concat(name.substring(name.lastIndexOf(".")));

        //fullpath
        String filePath=path+ File.separator+fileName1;


        //create folder if not created
        File f = new File(path);
        if(!f.exists()){
            f.mkdir();
        }

        //file copy

        Files.copy(file.getInputStream(), Paths.get(filePath));


        return name;
    }

    @Override
    public InputStream getResource(String path, String fileName) throws FileNotFoundException {

        String fullPath=path+File.separator+fileName;
        InputStream is = new FileInputStream(fullPath);

        //db logic to return inputstream

        return is;
    }

}
