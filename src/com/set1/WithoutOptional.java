package com.set1;

public class WithoutOptional {
    public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			
System.out.println("Generated String length -->"+
		RandomStringProvider.stringProvider((int)Math.round(Math.random()*10000)).length());
			
		}
	}
}
