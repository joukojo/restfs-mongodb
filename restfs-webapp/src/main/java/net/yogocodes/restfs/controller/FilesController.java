package net.yogocodes.restfs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.yogocodes.restfs.model.FileEntries;
import net.yogocodes.restfs.model.FileEntry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/files")
public class FilesController {

	@RequestMapping(value="/{fileName}", method=RequestMethod.GET)
	@ResponseBody
	public FileEntry getFile(@PathVariable("fileName") String fileName) {
		
		FileEntry fileEntry = new FileEntry();
		return fileEntry;
		
	}
	
	@RequestMapping(method=RequestMethod.GET) 
	@ResponseBody
	public FileEntries getFiles() {
		
		List<FileEntry> files = new ArrayList<FileEntry>();
		
		for( int i = 0 ; i < 5 ; i++ ) {
			FileEntry fileEntry = new FileEntry();
			fileEntry.setFileName("demo-" + i);
			fileEntry.setUrl("/rest/files/" + fileEntry.getFileName());
			files.add(fileEntry);
			
		}
		FileEntries fileEntries = new FileEntries();
		fileEntries.setFileEntries(files);
		return fileEntries;
	}
}
