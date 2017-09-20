package me.leolin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author leo
 */
@RestController
public class WordController {

    @Value("${words}")
    String[] words;

    @GetMapping("/")
    public String getWord() {
        return words[new Random().nextInt(words.length)];
    }

}
