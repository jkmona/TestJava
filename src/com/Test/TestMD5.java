package com.Test;

import java.security.MessageDigest;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class TestMD5 {

	public static void main(String[] args) throws ParseException {
		String data="appid=wxe53b547a3a8e242b&attach=pc&body=哈弗商城-订单支付&device_info=WEB&mch_id=1229864002&nonce_str=6fcJD9lbv0uLAdeDfNJxjkHO7E7f2peu&notify_url=http://10.53.3.9:8080/ec-web/wxpay/notify.html&out_trade_no=20170209143108132150&spbill_create_ip=127.0.0.1&total_fee=1&trade_type=NATIVE&key=jwlekfjwieur2o35kdgd9rh456k238fd";
		
		System.out.println("         MD5Encode::" + MD5Encode(data));
		System.out.println("DigestUtils.md5Hex::" + DigestUtils.md5Hex(data));
		//Base64.encodeBase64(binaryData)
		System.out.println("         MD5Encode(\"\")::" + MD5Encode(""));
		System.out.println("DigestUtils.md5Hex(\"\")::" + DigestUtils.md5Hex(""));
		
	}
	
private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7",
        "8", "9", "a", "b", "c", "d", "e", "f"};

/**
 * 转换字节数组为16进制字串
 * @param b 字节数组
 * @return 16进制字串
 */
public static String byteArrayToHexString(byte[] b) {
    StringBuilder resultSb = new StringBuilder();
    for (byte aB : b) {
        resultSb.append(byteToHexString(aB));
    }
    return resultSb.toString();
}

/**
 * 转换byte到16进制
 * @param b 要转换的byte
 * @return 16进制格式
 */
private static String byteToHexString(byte b) {
    int n = b;
    if (n < 0) {
        n = 256 + n;
    }
    int d1 = n / 16;
    int d2 = n % 16;
    return hexDigits[d1] + hexDigits[d2];
}

/**
 * MD5编码
 * @param origin 原始字符串
 * @return 经过MD5加密之后的结果
 */
public static String MD5Encode(String origin) {
    String resultString = null;
    try {
        resultString = origin;
        MessageDigest md = MessageDigest.getInstance("MD5");
        resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
    } catch (Exception e) {
        e.printStackTrace();
    }
    return resultString;
}

}
