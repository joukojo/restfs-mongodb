package net.yogocodes.restfs.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="file-entry")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileEntry {

	private String fileName; 
	private Date created;
	private Date modified; 
	private String url; 
	public String getFileName(){
		return fileName;
	}
	public void setFileName(String fileName){
		this.fileName = fileName;
	}
	public Date getCreated(){
		return created;
	}
	public void setCreated(Date created){
		this.created = created;
	}
	public String getUrl(){
		return url;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public Date getModified(){
		return modified;
	}
	public void setModified(Date modified){
		this.modified = modified;
	} 
}
