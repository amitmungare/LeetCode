package string;

public class RansomNote {

	public boolean canConstruct(String r, String m) {
        
        int arr[] =new int[26];
        
        for(char c: m.toCharArray()){
            arr[c-'a']++;
        }
        
         for(char c: r.toCharArray()){
            if(arr[c-'a']==0){
                return false;
            }
            arr[c-'a']--;        
        }
       return true; 
    }
}
