package JavaCodes.prafful;
import java.util.Arrays;
public class searchInString {
    public static void main(String[] args) {
        String name= "prafful rastogi";
        char taraget='o';
        System.out.println(search2(name, taraget));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searchString(String name, char target){
        for(int i=0;i<name.length();i++){
            if(name.length()==0){
                return false;
            }
            else{
                if (target != name.charAt(i)) {
                    return true;
                }
                return true;
            }
        }
        return false;
    }
    static boolean search2(String name, char target){
        for(char ch: name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
