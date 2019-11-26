package com.hcs.securepassword.service;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Getter@Setter
public class SecurePasswordService {

    List<URL> filenames= new ArrayList<>();

    @Autowired
    ApplicationContext applicationContext;

    @PostConstruct
    private void setUp() throws IOException {

        Resource[] resources = applicationContext.getResources("classpath*:images/*");
        for (Resource r: resources) {
            filenames.add(r.getURL());
        }
        System.out.println("Image URLs Loaded:"+filenames.toString());
    }
}
