package com.Test;
import java.text.SimpleDateFormat;
import java.util.*;

import net.sf.json.*;
public class TestJson {

	public static void main(String[] args) {
		//TestStringToJSONObject();
		
		//TestNullValueInJson();
		
		//TestNullFieldInJson();
		
		//TestJSONArrayAndList();
		
		TestMapAndJson();
		
		//TestJSONArrayAndList();
	}
	public static void TestStringToJSONObject(){
		String str = "{\"resultCode\": 1,\"data\":[{\"SubEcpNumber\":\"2015042206080091\"},{\"SubEcpNumber\":\"2015042206080090\"},{\"SubEcpNumber\":\"2015042206080092\"},{\"SubEcpNumber\":\"2015042206080093\"}]}";
		System.out.println("String str = " + str);
		
		JSONObject jo = JSONObject.fromObject(str);
		System.out.println("getString():" + jo.getString("resultCode"));
		System.out.println("getJSONArray():" + jo.getJSONArray("data").toString());
	}
	
	public static void TestNullValueInJson(){
		JSONArray ja = new JSONArray();
		JSONObject jo = new JSONObject();
		
		jo.put("fileName", null);
		jo.put("filesize", 2);
		jo.put("fileExt","exe");
		System.out.println("JSONObject null value:" + jo.toString());
		ja.add(jo);
		
		jo = new JSONObject();
		jo.put("fileName", "");
		jo.put("filesize", 2);
		jo.put("fileExt", null);
		jo.put("lastModifiedOn", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		ja.add(jo);
		System.out.println("JSONArray null value:" + ja.toString());		
	}
	public static void TestNullFieldInJson(){
		//测试实体NUll属性转换为jsonObject之后toString()
		UserFile oa = new UserFile();
		oa.setFileExtension("ext");
		oa.setFileName(null);
		oa.setFileSize(10);
		oa.setLastModifiedOn("");
		JSONObject jo = JSONObject.fromObject(oa);
		System.out.println("Object null field in json:" + jo.toString());
	}
	public static void TestMapAndJson(){
		Map<String, UserFile> mp= new HashMap<String, UserFile>();
		UserFile oa = new UserFile();
		oa.setFileExtension("ext");
		oa.setFileName(null);
		oa.setFileSize(10);
		oa.setLastModifiedOn(new Date().toString());
		mp.put("a", oa);
		JSONObject jo=JSONObject.fromObject(mp);
		System.out.println("JSONObject.fromObject(map);MapToJson:" + jo.toString());
		
		jo=JSONObject.fromObject(jo.toString());
		mp = (Map<String, UserFile>)JSONObject.toBean(jo, Map.class);
		
		System.out.println("JSONObject.toBean(jo, Map.class):" + mp.toString());
		
		oa = (UserFile)JSONObject.toBean(JSONObject.fromObject(mp.get("a")), UserFile.class);
		
		System.out.println("mp.get(\"a\"):"+ oa.toString());
	}
	
	public static void TestJSONArrayAndList(){
		List<UserFile> list = new ArrayList<UserFile>();
		
		UserFile oa = new UserFile();
		oa.setFileExtension("ext");
		oa.setFileName("file1");
		oa.setFileSize(10);
		oa.setLastModifiedOn(new Date().toString());
		list.add(oa);
		
		oa = new UserFile();
		oa.setFileExtension("ext");
		oa.setFileName("file2");
		oa.setFileSize(1000);
		oa.setLastModifiedOn(new Date().toString());
		list.add(oa);
		
		JSONArray ja = null;
		ja = JSONArray.fromObject(null);
		System.out.println("JSONArray.fromObject(null) 的结果："+ (ja==null ? "null" : ja.toString()));
		
		ja = JSONArray.fromObject("[]");
		System.out.println("JSONArray.fromObject(\"[]\") 的结果：" + (ja==null ? "null" : ja.toString()));
		
		ja = JSONArray.fromObject(list);
		System.out.println("JSONArray.fromObject(list) 的结果："+ja.toString());
		
		ja = JSONArray.fromObject(ja.toString());
		List cli = JSONArray.toList(ja, new UserFile(), new JsonConfig());
		System.out.println("JSONArrayToLlist的结果：" + (cli == null ? "null" : cli.toString()));
	}


}
