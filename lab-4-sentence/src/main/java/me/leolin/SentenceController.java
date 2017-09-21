package me.leolin;

import me.leolin.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leo
 */
@RestController
public class SentenceController {

    @Autowired
    private SubjectClient subjectClient;
    @Autowired
    private VerbClient verbClient;
    @Autowired
    private ArticleClient articleClient;
    @Autowired
    private AdjectiveClient adjectiveClient;
    @Autowired
    private NounClient nounClient;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return
                subjectClient.getWord() + " "
                        + verbClient.getWord() + " "
                        + articleClient.getWord() + " "
                        + adjectiveClient.getWord() + " "
                        + nounClient.getWord() + "."
                ;
    }


}
