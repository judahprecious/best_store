package com.boostmytool.beststore.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boostmytool.beststore.service.FileReadingService;

@RestController
public class FileViewController {
	
	@Autowired
	private FileReadingService  fileReadingService;
	
	@GetMapping("/read-file")
    public ModelAndView readFile() {	
		ModelAndView mv = new ModelAndView("fileView/index.html");
		
		try {
			List<String> fileContents = fileReadingService.readFile();
			mv.addObject("fileContents", fileContents);
			return mv;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return mv;
		
    }
	
}
