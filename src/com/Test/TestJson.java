package com.Test;
import java.text.SimpleDateFormat;
import java.util.*;

import net.sf.json.*;
public class TestJson {

	public static void main(String[] args) {
		JSONArray ja = new JSONArray();
		JSONObject jo = new JSONObject();
		/*
		jo.put("fileNamae", null);
		jo.put("filesize", 2);
		jo.put("fileExt","exe");
		ja.add(jo);
		
		jo = new JSONObject();
		jo.put("fileNamae", "");
		jo.put("filesize", 2);
		jo.put("fileExt","exe");
		jo.put("lastModifiedOn", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		ja.add(jo);
		//测试Null值在toString中的显示
		System.out.println(ja.toString());
		//
		
		//测试实体NUll属性转换为jsonObject之后toString()
		ObjectA oa = new ObjectA();
		oa.setFileExtension("ext");
		oa.setFileName(null);
		oa.setFileSize(10);
		oa.setLastModifiedOn(new Date());
		jo = JSONObject.fromObject(oa);
		System.out.println(jo.toString());
		
		//测试日期NUll属性转换为jsonObject之后toString()
		oa = new ObjectA();
		oa.setFileName(null);
		oa.setFileSize(100);
		oa.setLastModifiedOn(null);
		
		jo = JSONObject.fromObject(oa);
		System.out.println(jo.toString());
		*/
		jo = JSONObject.fromObject("{\"resultCode\": 1,\"data\":[{\"SubEcpNumber\":\"2015042206080091\"},{\"SubEcpNumber\":\"2015042206080090\"},{\"SubEcpNumber\":\"2015042206080092\"},{\"SubEcpNumber\":\"2015042206080093\"}]}");
		
		
		System.out.println(jo.toString());
		
		String jsonStr = MapToJson();
		JsonToMap(jsonStr);
	}
	public static String MapToJson(){
		Map<String,Object> mp= new HashMap<String,Object>();
		ObjectA oa = new ObjectA();
		oa.setFileExtension("ext");
		oa.setFileName(null);
		oa.setFileSize(10);
		oa.setLastModifiedOn(new Date().toString());
		mp.put("a", oa);
		JSONObject jo=JSONObject.fromObject(mp);
		System.out.println("MapToJson:"+jo.toString());
		return jo.toString();
	}
	public static void JsonToMap(String JsonString){
		JSONObject jo=JSONObject.fromObject(JsonString);
		Map<String,Object> mp= (Map<String,Object>)JSONObject.toBean(jo, Map.class);
		ObjectA oa = (ObjectA)JSONObject.toBean(JSONObject.fromObject(mp.get("a")), ObjectA.class);
		
		System.out.println("JosnToMap:"+ oa.toString());
	}
	
	public static class ObjectA
	{
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
			return lastModifiedOn.toString();
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

}
