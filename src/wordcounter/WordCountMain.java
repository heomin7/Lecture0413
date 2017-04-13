package wordcounter;

import wordcounter.service.WordCountService;
import wordcounter.service.WordCountServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountMain {
    public static void main(String[] args){


        List<String> wordList = new ArrayList<>();
        //1. read file
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src\\closer.txt"));


            String line = "";
            while((line = br.readLine()) != null){
                String[] words = line.split(" ");


                for(String e: words){
                    wordList.add(e);
                }

            }

//            for(String e: wordList){
//                System.out.println(e);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        WordCountService service = new WordCountServiceImpl();
        int count = service.getWordCount(wordList);
        System.out.println("word count: " + count);

    }
}
