package bin;

import java.util.HashMap;
import java.util.Map;

public class Guangyu {
	
	public int run(String str){
		if(str == null || str.length()<1){
			return 0;
		}
		int max=0;  
		int now=0;  
		Map<Character,Integer> map=new HashMap<Character,Integer>();  
		for(int i=0;i<str.length();i++){  
	            
			if(map.containsKey(str.charAt(i))){  
	                
				now=Math.max(map.get(str.charAt(i))+1,now);  
				if((i-now+1)>max){  
					max=i-now+1;  
				}  
	            }else{  
	                if((i-now+1)>max){  
	                    max=i-now+1;  
	                }  
	            }  
	            map.put(str.charAt(i), i);  
	        }  
	        return max;  
		
	}
	
	
}
