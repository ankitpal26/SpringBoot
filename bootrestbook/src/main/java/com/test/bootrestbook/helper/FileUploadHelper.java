package com.test.bootrestbook.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Component
public class FileUploadHelper {

    public final  String UPLOAD_DIR="C:\\One Drive\\OneDrive\\Desktop\\Spring Boot\\bootrestbook\\src\\main\\resources\\static\\image";

    public boolean uploadFile(MultipartFile multipart)
    {
        boolean f=false;

        try {

            InputStream is = multipart.getInputStream();
            byte


        }catch (Exception e){

            e.printStackTrace();
        }


        return f;
    }
}
