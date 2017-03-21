package org.alicebot.ab;

public class SearchContext {

    public static SearchStrategy strategy;

    public static String process(Chat chatSession, String content) {
        return strategy.process(chatSession, content);
    }
}
