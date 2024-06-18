package pwd;

import in.ashok.it.PassowrdUtils;

public class Test {
	public static void main(String[] args) {
	PassowrdUtils cls= new PassowrdUtils();	
	String encou=cls.encoudPwd("@Abc123");
	System.out.println(encou);
	}

}
