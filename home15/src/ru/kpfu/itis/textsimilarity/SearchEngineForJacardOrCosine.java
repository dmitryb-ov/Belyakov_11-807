package ru.kpfu.itis.textsimilarity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchEngineForJacardOrCosine {
    {
        SearchEngine se = new SearchEngineImp();
        TextProvider query = new SimpleTextProvider("Мама мыла");
        TextProvider test1 = new SimpleTextProvider(" раму");
        TextProvider test2 = new SimpleTextProvider("Мама раму мыла");
        TextProvider test3 = new SimpleTextProvider("Мама ");
        TextProvider test4 = new SimpleTextProvider("Мама и рама");
        List<TextProvider> providers = new ArrayList<>();
        providers.add(test1);
        providers.add(test2);
        providers.add(test3);
        providers.add(test4);
        List<Double> results = se.getSortedByRelevanceList(query,providers); //TextProvider
        for (Double TP : results){ //TextProvider
            System.out.println(TP);
        }
    }
}
