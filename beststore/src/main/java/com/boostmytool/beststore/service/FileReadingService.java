package com.boostmytool.beststore.service;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
 
@Service
public class FileReadingService {
	public List<String> readFile() throws IOException {
	    Path path = Paths.get("src/main/resources/sample.txt");
	    return Files.readAllLines(path);
	}
}
