package strings2;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtil_2 {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

   void printingTwoChars(String word){
       StringBuilder Word = new StringBuilder(word);
       StringBuilder result = new StringBuilder();
       if (Word.charAt(0) == 'o'){
           result.append('o');
       }
       if(Word.charAt(1) == 'z'){
           result.append('z');
       }
       System.out.println(result);
   }


    /**
     * checking whether the word is palindrome
     * @param S
     */
      void isPalindrome(String S) {
        StringBuilder Builder = new StringBuilder(S);
        Builder.reverse();
        if (S.equals(Builder.toString())){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
     }

    /**
     * Given a list of strings, write a method that returns a list of all strings that
     * start with the letter 'a' (lower case) and have exactly 3 chars.
     * @param S
     */
     void printSomeStrings(String... S){
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("a46");arrayList.add("aA56");
         arrayList.add("A67");arrayList.add("osqA");arrayList.add("aAa");
         for (int i = 0; i < arrayList.size(); i++){
             if ( (arrayList.get(i).startsWith("a")) && (arrayList.get(i).length() == 3) ){
                 System.out.print(arrayList.get(i) + " ");
             }
         }
     }

    /**
     *Given two strings, find the number of common characters between them
     * @param A
     * @param B
     */
      static void commonCharacters(String A, String B){
         char [] first = A.toCharArray();
         char [] second = B.toCharArray();
         int matches = 0;
         StringBuilder SB = new StringBuilder();
         for (int i = 0; i < first.length; i++){
             for (int j = 0; j < first.length; j++){
                 if (first[i] == second[j]){
                     matches++;
                     SB.append(first[i]);
                 }
             }
         }
          System.out.println(matches);
     }


    /**
     * adding numbers printing 'o' or 'e' regardless of the being odd or even + seperating members by commas
     */
     void printingListOfIntegers() {
       StringBuilder SB = new StringBuilder();
       ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) % 2 == 0){
                SB.append('e').append(arrayList.get(i)).append(',');
            }else{
                SB.append('o').append(arrayList.get(i)).append(',');
            }
        }
       System.out.println(SB.toString());
     }


//     void findLongestSubsequence(String A, String B){
//         char [] first = A.toCharArray();
//         char [] second = B.toCharArray();
//         int lengthOFSequence = 0;
//         StringBuilder SB = new StringBuilder();
//
//     }

    //+-
    void countOfOccurrences(String line, String token){
         StringBuilder SB = new StringBuilder(token);
         char array [] = line.toCharArray();
         int count = 0;
         for (int i = 0; i < line.length() + 1  ; i++){

             if ((array.length != i +1 )&& (SB.equals(array[i] + array[(i+1)])) ){
                 count++;

             }
         }
        System.out.println(count);
    }

    //
    void cipherCaesar(String code, int shiftKey){
       code = code.toLowerCase();
       String finalCode = "";
       for (int i = 0; i < code.length(); i++){
           int position = ALPHABET.indexOf(code.charAt(i));

           int encryptPosition = (shiftKey + position ) % 26; // 26 tar ka nagleren mod en ogtagorcum (x) = (x+n)mod 26
           char encryptChar = ALPHABET.charAt(encryptPosition);

           finalCode += encryptChar;
       }
       System.out.println(finalCode);

    }

    static void reverseSubString(String myLine, String mySub) {
        int position = mySub.indexOf(myLine);
        StringBuilder ending = new StringBuilder(myLine);
        StringBuilder finalResult = new StringBuilder();
        StringBuilder line = new StringBuilder(myLine);
        StringBuilder sub = new StringBuilder(mySub);
        if (line.toString().contains(mySub.toString())) {
            position = line.indexOf(sub.toString());
            StringBuilder beginning = line.delete(position, line.length());
            ending.delete(0, sub.length() + line.length());
            System.out.println("FINAL  = " + beginning.append(sub.reverse()).append(ending));
           // System.out.println(line.append(reversed,position,position + sub.length()));
        }
    }

    public static void main(String[] args) {

         reverseSubString("kabar3","bar");




    }
}
