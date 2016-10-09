package com.Test;

public class TestObjectParameter {
	public static void main(String[] args) {
		Boolean bObject = null;
		UserFile uf = new UserFile();
		uf.setFileExtension(".png");
		
		changeObjectInParameter(uf, bObject);
		
		System.out.println(uf.getFileExtension());
		
		System.out.println(Boolean.TRUE.equals(bObject));
		System.out.println(Boolean.FALSE.equals(bObject));
		bObject = false;
		System.out.println(Boolean.TRUE.equals(bObject));
		System.out.println(Boolean.FALSE.equals(bObject));
		bObject = true;
		System.out.println(Boolean.TRUE.equals(bObject));
		System.out.println(Boolean.FALSE.equals(bObject));
	}
	protected static UserFile changeObjectInParameter(UserFile uf, Boolean bObject){
		uf.setFileExtension(".jpg");
		if(Boolean.TRUE.equals(bObject)){
			uf.setFileName("test Boolean Successed");
		}else{
			uf.setFileName("test Boolean Failed");
		}
		bObject = true;
		return uf;
		
	}
}
