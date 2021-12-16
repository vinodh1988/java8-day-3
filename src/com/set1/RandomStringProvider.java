package com.set1;

import java.util.Optional;

public class RandomStringProvider {
    final static String[] names= {"Rock","Ram","Roger","Aravind","Ajay","Kiran","Ashley"};
	public static String stringProvider(int sno) {
		
		if(sno%7==0 || sno% 17 % sno%19==0)
			return null;
		
			return	names[(int)Math.round(Math.random()*6)];
	}
	
	public static Optional<String> randomStringProvider(int sno)
	{
		if(sno%7==0 || sno% 17 % sno%19==0)
			return Optional.ofNullable(null);
		
			return	Optional.of(names[(int)Math.round(Math.random()*6)]);
	}
}
