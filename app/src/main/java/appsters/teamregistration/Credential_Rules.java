package appsters.teamregistration;

public class Credential_Rules {
    public static boolean isalphabet(char x){
        if(Character.isAlphabetic(x)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isnumber(char x){
        if(Character.isDigit(x)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isentryno(String s){
        char[] y = s.toCharArray();
        if(y.length!=11){
            return false;
        }else if(isnumber(y[0])&&isnumber(y[1])&&isnumber(y[2])&&isnumber(y[3])&&isalphabet(y[4])&&isalphabet(y[5])&&isnumber(y[6])&&isnumber(y[7])&&isnumber(y[8])&&isnumber(y[9])&&isnumber(y[10])){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isempty(String s){
       return s.equals("");
    }
    public static boolean isname(String s){
        if(s.equals("")){
            return false;
        }
        char[] y = s.toCharArray();
        for(char a : y){
            if(isalphabet(a)){

            }else{
                return false;
            }
        }
        return true;
    }
}
