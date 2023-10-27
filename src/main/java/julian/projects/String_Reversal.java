package julian.projects;

public class String_Reversal {
    public String reversedString(String string){
        char[] charArray = string.toCharArray();
        StringBuilder reversedWord = new StringBuilder();
        for(int i = charArray.length -1; i >=0; i--){
            reversedWord.append(charArray[i]);
        }
        return reversedWord.toString();
    }


}
