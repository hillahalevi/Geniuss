package service.impl;

import org.springframework.stereotype.Component;
import service.IProcessor;
@Component
public class MostCommonWordProcessor implements IProcessor {
    @Override
    public String process(String text) {
        String[] words = text.toLowerCase().split("([,.\\s]+) ");
        String  word = "";
        int count = 0, maxCount = 0;
        for(int i = 0; i < words.length; i++){
            count = 1;
            //Count each word in the file and store it in variable count
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            /*
            If maxCount is less than count then store value of count in maxCount
            and corresponding word to variable word
            */
            if(count > maxCount){
                maxCount = count;
                word = words[i];
            }
        }

        return word;
    }
}
