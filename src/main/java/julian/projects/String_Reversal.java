package julian.projects;

public class String_Reversal {

    /*
    Simple code that turns the passed parameter to a character array, then goes through a for loop
    adding the back of the character array to a StringBuilder then returning the value as a String
     */
    public String reversedString(String string){
        char[] charArray = string.toCharArray();
        StringBuilder reversedWord = new StringBuilder();
        for(int i = charArray.length -1; i >=0; i--){
            reversedWord.append(charArray[i]);
        }
        return reversedWord.toString();
    }


}
