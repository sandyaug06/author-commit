package com.xoriant;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSSSS");
		//TemporalAccessor parse = formatter.parse(new StringBuilder("20211025123450000000"));
		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");  
	    String strDate= formatter.format("20211025162021");  
	    System.out.println(strDate);  
		
	//	yyyy-mm-dd hh:mm:ss[.fffffffff]
		
	}
	
}
