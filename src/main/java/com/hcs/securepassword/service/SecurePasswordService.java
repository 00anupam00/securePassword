package com.hcs.securepassword.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Getter@Setter
public class SecurePasswordService {

    List filenames= new ArrayList<>();

    @PostConstruct
    private void setUp(){
        URL url = getClass()
                .getClassLoader().getResource("images/");
        try {
            filenames= Files.list(Paths.get(url.toURI())).collect(Collectors.toList());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
