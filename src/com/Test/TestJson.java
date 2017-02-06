package com.Test;
import java.text.SimpleDateFormat;
import java.util.*;

import net.sf.json.*;
public class TestJson {

	public static void main(String[] args) {
		//TestGetJson();
		//TestStringToJSONObject();
		
		//TestNullValueInJson();
		
		//TestNullFieldInJson();
		
		//TestJSONArrayAndList();
		
		TestMapAndJson();
		
		//TestJSONArrayAndList();
		
		//testJSONCaseSensitive();
	}
	public static void TestGetJson(){
		JSONArray ja = new JSONArray();
		JSONObject jo = new JSONObject();
		
		jo.put("fileName", null);
		jo.put("filesize", 2);
		jo.put("fileExt","exe");
		ja.add(jo);
		
		jo = new JSONObject();
		jo.put("fileName", "");
		jo.put("filesize", 2);
		jo.put("fileExt", null);
		jo.put("lastModifiedOn", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		ja.add(jo);
		ja.add("");
		System.out.println("JSONArray::" + ja.toString());
		System.out.println("JSONObject get:" + ja.optJSONObject(2));
	}
	public static void TestStringToJSONObject(){
		String str = "{\"resultCode\": 1,\"data\":[{\"SubEcpNumber\":\"2015042206080091\"},{\"SubEcpNumber\":\"2015042206080090\"},{\"SubEcpNumber\":\"2015042206080092\"},{\"SubEcpNumber\":\"2015042206080093\"}]}";
		System.out.println("String str = " + str);
		
		JSONObject jo = JSONObject.fromObject(str);
		System.out.println("getString():" + jo.getString("resultCode"));
		System.out.println("getJSONArray():" + jo.getJSONArray("data").toString());
		
		str = null;
		jo = JSONObject.fromObject(str);
		System.out.println("String str = " + str +"; jo:"+jo);
		//报错
		str = "";
		jo = JSONObject.fromObject(str);
		System.out.println("String str = " + str +"; jo:"+jo);
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
	
	public static void testJSONCaseSensitive(){
		SaleClueProductInfo sc = new SaleClueProductInfo();
		sc.setSaleClueProductInfoID("4145464f8wqefqwetq");// 必填
		sc.setSaleClueInfoID("ergwergwerh34w5h3w45h45");// 必填
		sc.setSubOrderType(0);// 必填
		sc.setName("哈弗H9");

		sc.setKind("哈弗H9");// 必填
		// sc.setCarType(getKeyParam(attrList,
		// Constants.KEY_PARAM_CAR_TYPE));// 必填
		sc.setCarType("尊贵型");// 必填
		sc.setPattern("2016款");// 必填
		sc.setConfiguration("两驱");// 必填
		sc.setEngineType("欧5");// 必填
		sc.setConfigurationNumber("DFADF232");// 必填
		sc.setExportVersion("国内版");// 必填
		sc.setECpDefaultOption("1231231243");
		sc.setEcpOption("ASDFASDFJKWEJOI2343KL4J2"); // 该选装为整车商品数据
		JSONObject jo=JSONObject.fromObject(sc);
		System.out.println(jo.toString());
	}

}
