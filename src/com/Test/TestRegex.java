package com.Test;

import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "13022919851029183X";
		System.out.println("13022919851029183X:" + validIdentityCard(s));
		s = "13022919851029183";
		System.out.println("93022919851029183X:"+validIdentityCard(s));
		s = "440901197709194316";
		System.out.println("440901197709194316:"+ validIdentityCard(s));
		s = "130181198309157938";
		System.out.println("130181198309157938:"+ validIdentityCard(s));
		s = "123456";
		System.out.println("123456:"+ validPasswordComplex(s));
		s = "123456789";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "bav123456789";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "bavasdfasdfd";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "bavadfa@fd";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "......._@@@";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "bava$dfa@f#d";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "bavadfa@fd.com";
		System.out.println(s +":" + validPasswordComplex(s));
		s = "_________";
		System.out.println(s +":" + validPasswordComplex(s));
	}
	public static boolean validIdentityCard(String cardNo){
		if(cardNo == null || cardNo.length() == 0 || (cardNo.length() != 15 && cardNo.length() != 18)) {
			return false;
		}
		if(cardNo.length() == 15){
			return Pattern.matches("(^[1-9][0-9]{5}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}$", cardNo);
		}
		if(cardNo.length() == 18){
			return Pattern.matches("(^[1-9][0-9]{5}((18[0-9]{2})|(19[0-9]{2})|(20[0-9]{2}))(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[0-9xX]$)", cardNo);
		}
		return true;
	}
	public static boolean validPasswordComplex(String password){
		if(password == null){
			return false;
		}
		int size = password.length();
		if(size == 0 || size < 8) {
			return false;
		}
		if(password.matches("^[a-zA-Z]*$") || password.matches("^[0-9]*$") || password.matches("^[@_.]*$")){
			return false;
		}
		if(password.matches("^[a-zA-Z0-9@_.]{8,50}")){
			return true;
		}else{
			return false;
		}
	}
}
