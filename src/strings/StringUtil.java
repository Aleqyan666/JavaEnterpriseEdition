package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class StringUtil {
    /**
     * prints concatenation
     * @param first
     * @param second
     */
    public  void stringConcat(String first, String second){
        String result = "";
        result = first.concat(second);
        System.out.println(result);
    }

    /**
     * prints concatenation
     * @param first
     * @param second
     * @param third
     */
    public  void stringConcat2(int first, int second, String third){
        String result = "";
        result = first + second + third;
        System.out.println(result);
    }

    /**
     * prints concatenation
     * @param first
     * @param second
     * @param third
     */
    public  void stringConcat3(String first, int second, String third){
        String result = "";
        result = first + second + third;
        System.out.println(result);
    }

    /**
     * prints concatenation
     * @param first
     * @param second
     * @param third
     * @param fourth
     */
    public  void stringConcat4(String first, int second, int third, String fourth){
        String result = "";
        result = first + second + third + fourth;
        System.out.println(result);
    }

    /**
     * returns concatenation
     * @param first
     * @param second
     */
    public void sbConcat(String first, String second){
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(second);
        System.out.println(sb);
    }

    /**
     * returns concatenation
     * @param first
     * @param second
     * @param third
     */
    public void sbConcat2(int first, int second, String third){
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(second).append(third);
        System.out.println(sb);
    }

    /**
     * returns concatenation
     * @param first
     * @param second
     * @param third
     */
    public void sbConcat3(String  first, int second, String third){
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(second).append(third);
        System.out.println(sb);
    }

    /**
     * returns concatenation
     * @param first
     * @param second
     * @param third
     * @param fourth
     */
    public void sbConcat4(String  first, int second, int third, String fourth){
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(second).append(third).append(fourth);
        System.out.println(sb);
    }

    /**
     * converting a sentence into words
     * @param actual
     */
    public  void intoWords(String actual){
        String result = actual.replaceAll(" ", "\n");
        System.out.println(result);

    }

    /**
     * reverse the String variable
     * @param S
     */
    public  void reverseString(String S){
        StringBuilder stringBuilder = new StringBuilder(S);
        System.out.println(stringBuilder.reverse());
    }

//    public static int countSubString(String line, String token){
//       int count = 0;
//       char[] result = line.toCharArray();
//       for (int i = 0; i < result.length; i++){
//
//       }
//       return count;
//
//    }

    /**
     * to uppercase
     * @param S
     */
    public  void stToUppercase(String S){
        String result = S.toUpperCase();
        System.out.println(result);
    }

    /**
     * to uppercase
     * @param S
     */
    public  void sbToUppercase(String S){
        StringBuilder stringBuilder = new StringBuilder(S);
        System.out.println(stringBuilder.toString().toUpperCase());
    }

    /**
     * remove all 'a's
     * @param actual
     */
    public  void removeCertainLetter(String actual){
        System.out.println(actual.replaceAll("a",""));
    }

    /**
     * replacing 'a' with '*'
     * @param actual
     */
    public void  reverseTwoCharsInString(String actual){
        System.out.println(actual.replaceAll("a","*"));
    }

//    public static void  longestWord(String actual){
//        int reserve = 0;
//        String result = actual.replaceAll(" ", "\n");
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add(result);
//        System.out.println(result);
//        for (int i = 0; i < arrayList.size(); i++){
//            reserve =
//            System.out.println(reserve);
//        }
//
//    }

    /**
     * printing index of the first items occurence
     * @param actual
     */
    public void indexOfFirstMatch(String actual){
        char c = 'a';
        int count = 0;
        char [] array = actual.toCharArray();
        for (int i = 0; i < actual.length(); i++){
            if(count == 1){
                break;
            }
            if (array[i] == c){
                System.out.println("index  " + i);
                ++count;
            }
        }
    }

    /**
     * print the line to the given limit
     * @param actual
     * @param index
     */
    public static void printToIndex(String actual, int index){
        char[] array = actual.toCharArray();
        if (index > array.length){
          //  throw ArrayIndexOutOfBoundsException;
        }
        for(int i = 0; i < index; i++){
            System.out.println(array[i]);
        }
    }

    /**
     * checks if the string is empty
     * @param S
     */
    public void isEmptySt(String S){
        if (S.isEmpty()){
            System.out.println("The string is empty");
        }
    }

    /**
     * returns longest word of the sentence
     * @param line
     */
    public void sepAndLongest(String line){
        int limit = 0;
        String reserve = "";
        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("[^\\w]", "");
            if (words[i].length() > limit){
                reserve = words[i] ;
                limit = words[i].length();
            }
        }
        System.out.println(reserve);

    }

    /**
     * return the longest word
     * @param line
     */
    public  void seperateAndLongestWord(String line){
        int limit = 0;
        String reserve = "";
        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("[^\\w]", "");
            if (words[i].length() > limit){
                reserve = words[i] ;
                limit = words[i].length();
            }
        }
        System.out.println(reserve);
    }

//    public static void substringRepetitions(String line, String token){
//        String result = line.replaceAll(" ", "\n");
//
//        ArrayList list = new ArrayList<>();
//        list.add(result);
//        System.out.print(list);
//
//    }

    /**
     * adding "*"s to have total of 20chars
     * @param line
     */
    public void inputStringAsterisks(String line){
        StringBuilder stringBuilder = new StringBuilder(line);
        line = stringBuilder.toString();
        for (int i = 0; i < 20; i++){
            if (line.length() < 20){
                line += "*";
            }
        }
        System.out.println(line);
    }

    public void countSubString(String line, String token){
            int count = 0;
            char [] array = line.toCharArray();
            Arrays.asList(array);
            for (int i = 0; i < array.length; i++){
                if (token.equals(array[i])){
                    System.out.println("index  " + i);
                    ++count;
                }
            }
    }




    public static void main(String[] args) {

    }
}
