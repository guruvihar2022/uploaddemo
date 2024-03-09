package com.fileupload.uploaddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fileupload.uploaddemo.service.FilesStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class UploaddemoApplication implements CommandLineRunner{

	  @Resource
	  FilesStorageService storageService; 

	  public static void main(String[] args) {
	    SpringApplication.run(UploaddemoApplication.class, args);
	  }

	  @Override
	  public void run(String... arg) throws Exception {
	    storageService.init();
	  }
}
