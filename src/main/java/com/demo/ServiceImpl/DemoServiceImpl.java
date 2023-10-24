package com.demo.ServiceImpl;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

import com.demo.Service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	public String getInputUploadFile(String filename) throws Exception {
		String directoryPath = "/Users/Chhavi Sharma/Desktop/chavi pagal/";
		String dymamicFile = filename + ".txt";
		Path path = Paths.get(directoryPath, dymamicFile);
		File inputFile = path.toFile();
		if (inputFile.exists()) {
			inputFile.delete();
			inputFile.createNewFile();
		} else {
			inputFile.createNewFile();
		}
		return "Done";
	}
	
	public String getInputDeleteFile(String filename) throws Exception {
		String directoryPath = "/Users/Chhavi Sharma/Desktop/chavi pagal/";
		String dymamicFile = filename + ".txt";
		Path path = Paths.get(directoryPath, dymamicFile);
		File inputFile = path.toFile();
		if (inputFile.exists()) {
			inputFile.delete();
			System.out.println("file is present");
		} else {
			System.out.println("file is not present to delete");
		}
		return "Deleted";
	}

}
