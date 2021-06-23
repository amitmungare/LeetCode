package string;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] s) {
        if(s.length==0)return "";
		String res =s[0];
	   
		for(int i=1 ; i<s.length; i++){
		   while(s[i].indexOf(res) != 0) {
			   res=res.substring(0, res.length()-1);
		   }
		}
		return res;
    }
}
