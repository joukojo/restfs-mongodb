package net.yogocodes.restfs.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="file-entries")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileEntries {
	
	private List<FileEntry> fileEntries;

	public List<FileEntry> getFileEntries(){
		return fileEntries;
	}

	public void setFileEntries(List<FileEntry> fileEntries){
		this.fileEntries = fileEntries;
	}

}
