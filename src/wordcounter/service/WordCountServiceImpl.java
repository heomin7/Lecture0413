package wordcounter.service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountServiceImpl implements WordCountService {


    @Override
    public int getWordCount(List<String> list) {

        int wordCount = 0;

        for(String e: list){
            if(!e.equals("")){
                wordCount++;
            }
        }
        return wordCount;
    }
}
