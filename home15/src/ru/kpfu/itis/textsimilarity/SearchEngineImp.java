package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchEngineImp implements SearchEngine {
    TextAnalyzer analyzer = new JacardTextAnalayzer();
    TextAnalyzer cosAnalyzer = new CosMethod();
    @Override
    public List<Double> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources){
        TextAnalyzer analyzer = new JacardTextAnalayzer();
        TextAnalyzer cosAnalyzer = new CosMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Jacard(1) or Cosine(2)?");
        int params = sc.nextInt();
        List<Double> coef1 = new ArrayList<>(); //TextProvider
        List<TextProvider> name = new ArrayList<>();
        //List<Double> coef2 = new ArrayList<>(); //TextProvider
        switch (params){
            case 1:
                for(int i = 0; i < sources.size(); i++) {
                    coef1.add(analyzer.analyze((target), (TextProvider) sources.get(i)));
                    /*coef1.add(analyzer.analyze((target), (TextProvider) sources.get(1)));
                    coef1.add(analyzer.analyze((target), (TextProvider) sources.get(2)));
                    coef1.add(analyzer.analyze((target), (TextProvider) sources.get(3)));*/
                }
                Collections.sort(coef1);
                //bubbleSort(Collections.singletonList(sources.size()), target, coef1);
                break;
            case 2:
                for(int i = 0; i < sources.size(); i++) {
                    coef1.add(cosAnalyzer.analyze((target), sources.get(i)));
                }
                Collections.sort(coef1);
                //bubbleSort(name);
                break;
        }
        return coef1;
    }

    /*private List<TextProvider> bubbleSort (List<TextProvider> sources,TextProvider target, List<Double> coef1){
        List<Double> coef2 = new ArrayList<>();
        for (int i = 0; i < sources.size(); i++) {
            for (int j = 0; j < sources.size(); j++) {
                if(coef1.get(i) == coef2.add(analyzer.analyze((target), (TextProvider) sources.get(i)))){

                }
            }
        }
        return name;
    }*/
}
