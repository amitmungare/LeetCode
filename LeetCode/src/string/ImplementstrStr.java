package string;

public class ImplementstrStr {

	public  int strStr(String haystack, String needle) {
        
        if(haystack.length()==0 && needle.length()==0) return 0;

        for(int i=0; i<haystack.length(); i++){
           return haystack.indexOf(needle);
        }
        return -1;
    }
}
