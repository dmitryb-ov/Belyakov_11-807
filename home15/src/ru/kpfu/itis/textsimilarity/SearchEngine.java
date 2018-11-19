package ru.kpfu.itis.textsimilarity;

//import ru.kpfu.itis.textsimilarity.TextProvider;

import java.util.List;

public interface SearchEngine {
    List<Double> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources);
}
