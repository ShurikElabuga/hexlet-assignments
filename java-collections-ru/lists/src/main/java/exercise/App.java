package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public static boolean scrabble(String letters, String word){
        char[]let=letters.toLowerCase().toCharArray();
        char[]wor=word.toLowerCase().toCharArray();

        List<Character> lettersList=new ArrayList<>();
        List<Character> wordList=new ArrayList<>();
        List<Character> list=new ArrayList<>();

        for(char str:let){
        lettersList.add(str);
        }
        for(char string:wor){
        wordList.add(string);
        }
        boolean result=false;

        if(lettersList.size()<wordList.size()){
        return result;
        }
        for(Character wd:wordList){
        if(lettersList.contains(wd)&&!list.contains(wd)){
        list.add(wd);
        result=true;
        }
        }
        return result;
        }
//END
