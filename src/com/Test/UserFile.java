package com.Test;

public class UserFile {
	
	private String fileName;
	private int fileSize;
	private String fileExtension;
	private String lastModifiedOn;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public String getLastModifiedOn() {
		return lastModifiedOn;
	}
	public void setLastModifiedOn(String lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	@Override
	public String toString(){
		return this.getFileName() + this.getFileExtension() + ","
				+ this.getFileSize() + "," + this.getLastModifiedOn();
		}
}
