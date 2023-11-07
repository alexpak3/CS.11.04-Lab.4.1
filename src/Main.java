public class Main {

    // 1. parenthesesCheck
public static boolean parenthesesCheck(String str){
    int ncount=0;
    int zcount =0;
    boolean result = false;
    for ( int i= 0; i< str.length(); i++){
        if (str.charAt(i)=='(') {
            ncount ++;
        }
        else if (str.charAt(i)==')'){
            zcount++;
        }
    }
    if(zcount==ncount) result = true;
    else result = false;
    return result;
}

    // 2. reverseInteger
public static String reverseInteger(int n){
    String cast ="";
    String result = "";
    cast += n;
    for ( int i = cast.length()-1; i >= 0; i--){
        result += cast.charAt(i);
    }
    return result;

}
    // 3. encryptThis

public static String encryptThis(String str){
    String result = "";
    int start = 0;
    int end = str.indexOf(" ");
    while (end >= 0) {
        String word = str.substring(start, end);
        int code = (int) word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (word.length() > 2) {
            char second = word.charAt(1);
            word = code + "" + last + word.substring(2, word.length() - 1) + second;
        } else {
            word = code + "" + last;
        }
        result += word + " ";
        start = end + 1;
        end = str.indexOf(" ", start);
    }
    String word = str.substring(start);
    int code = (int) word.charAt(0);
    char last = word.charAt(word.length() - 1);
    if (word.length() > 2) {
        char second = word.charAt(1);
        word = code + "" + last + word.substring(2, word.length() - 1) + second;
    } else {
        word = code + "" + last;
    }
    result += word;
    return result;

}
    // 4. decipherThis
    public static String decipherThis(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if ((Character.isDigit(word.charAt(2))) && word.length() == 4) {
                int code = Integer.parseInt(word.substring(0,3));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(3) + " ";
            }
            else if ((Character.isDigit(word.charAt(2))) && word.length() == 5) {
                int code = Integer.parseInt(word.substring(0,3));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(word.length() - 1) + word.charAt(3) + " ";
            } else if (((Character.isDigit(word.charAt(2)) && word.length() == 6))) {
                int code = Integer.parseInt(word.substring(0,3));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(word.length() - 1) + word.charAt(4) + word.charAt(3) + " ";
            } else if (((!Character.isDigit(word.charAt(2)) && word.length() == 6))) {
                int code = Integer.parseInt(word.substring(0,2));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3,5) + word.charAt(2) + " ";
            } else if (Character.isDigit(word.charAt(2))){
                int code = Integer.parseInt(word.substring(0,3));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3, word.length() - 1) + word.charAt(3) + " ";
            }
            else {
                int code = Integer.parseInt(word.substring(0,2));
                char firstChar = (char) code;
                result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3, word.length() - 1) + word.charAt(2) + " ";
            }
        }

        return result.substring(0,result.length()-1);
    }
}

