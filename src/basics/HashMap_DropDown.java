package basics;

import java.util.HashMap;
import java.util.Map;

public class HashMap_DropDown 
{
public static void main(String[] args) 
{
	Map<String, Integer> map = new HashMap<String, Integer>();
	String [] s1 = {"jan","mar","feb","mar","mar"};
	
	for (String string : s1) 
	{
		if(!map.containsKey(string))
		{
			map.put(string, 1);
		}
		else
		{
			map.put(string, map.get(string)+1);
		}
	}
	System.out.println(map);
}
}
